package com.erye.aspect;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;

public class LogAspect {

	public Object logAround(ProceedingJoinPoint point) {
		
		Object result = null;
		Object[] args = point.getArgs();
		Signature signature = point.getSignature();
		String methodName = signature.getName();
		Class clazz = signature.getDeclaringType();
		
		try {
			System.out.println("方法--" + methodName + ",开始执行,参数>>>" + Arrays.asList(args) + ",全限定名称>>>"+ clazz);
			result = point.proceed(args);
			System.out.println("方法--" + methodName + ",执行中,返回结果>>>" + result + ",全限定名称>>>"+ clazz);
		}catch (Exception e) {
			System.out.println("方法--" + methodName + ",异常,异常>>>" + e + ",全限定名称>>>"+ clazz);
		} catch (Throwable e) {
			System.out.println("方法--" + methodName + ",异常,异常>>>" + e + ",全限定名称>>>"+ clazz);
		}finally {
			System.out.println("方法--" + methodName + "，执行结束" + ",全限定名称>>>"+ clazz);
			return result;
		}
	}
}
