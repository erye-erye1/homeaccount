<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>账户页面</title>
</head>
<body>
	<table  align="center" border="1px">
		<tr>
			<td align="center" style="width: 166px">家底儿</td>
			<td align="center" style="width: 166px">肉肉</td>
			<td align="center" style="width: 166px">二爷</td>
			<td align="center" style="width: 166px">馅儿饼</td>
			<td align="center" style="width: 166px">加入时间</td>
		</tr>
		<form action="<%=request.getContextPath() %>/back/manage/account" method="post">
			<tr>
				<td align="center" style="width: 166px">
					<input type="text" value=""/>
				</td>
				<td align="center" style="width: 166px">
					<input type="text" name="an"/>
				</td>
				<td align="center" style="width: 166px">
					<input type="text" name="han"/>
				</td>
				<td align="center" style="width: 166px">
					<input type="text" name="extraincome"/>
				</td>
				<td align="center" style="width: 166px">
					<input type="submit" value="添加点儿钱"/>
				</td>
			</tr>
		</form>
		<c:if test="${accountList != '[]' }">
			<c:forEach items="${accountList }" var="account">
				<tr>
					<td align="center" style="width: 166px">${account.sum }</td>
					<td align="center" style="width: 166px">${account.an }</td>
					<td align="center" style="width: 166px">${account.han }</td>
					<td align="center" style="width: 166px">${account.extraincome }</td>
					<td align="center" style="width: 166px">${account.create_time }</td>
				</tr>
			</c:forEach>
		</c:if>
	</table>
</body>
</html>