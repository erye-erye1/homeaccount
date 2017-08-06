<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理user页面</title>
</head>
<body>
	
	<table align="center" border="1px">
		<tr>
			<td style="width:188px;" align="center">账号</td>
			<td style="width:188px;" align="center">密码</td>
			<td style="width:188px;" align="center">权限</td>
			<td style="width:188px;" align="center">创建时间</td>
			<td style="width:188px;" align="center">修改时间</td>
			<td style="width:188px;" align="center">操作</td>
		</tr>
		<c:forEach items="${userList }" var="user">
			<form name="myform" id="myform" action="<%=request.getContextPath() %>/back/manage/user/${user.name }" method="post">
				<tr>
					<td style="width:188px;" align="center">
						<input type="text" name="name" value="${user.name }"/>
					</td>
					<td style="width:188px;" align="center">
						<input type="text" name="password" value="${user.password }"/>
					</td>
					<td style="width:188px;" align="center">${user.authority }</td>
					<td style="width:188px;" align="center">
						<input type="text" name="create_time" value="${user.create_time }"/>
					</td>
					<td style="width:188px;" align="center">${user.modify_time }</td>
					<td style="width:188px;" align="center">
						<input type="hidden" name="_method" id="_method" value="delete"/>
						<input type="submit" id="delete" onclick="adjustRest('delete','_method')" value="删除"/>
						<input type="submit" id="update" onclick="adjustRest('update','_method')" value="修改"/>
					</td>
				</tr>
			</form>
		</c:forEach>
	</table>
	<br><br><br><br><br><br>
	<form action="<%=request.getContextPath() %>/back/manage/user" method="post">
		<table align="center" border="1px">
			<tr>
				<td>账号：</td>
				<td>
					<input type="text" name="name" value="" maxlength="10" placeholder="请输入牛逼的名字"/>
				</td>
			</tr>
			<tr>
				<td>密码：</td>
				<td>
					<input type="password" name="password" value="" maxlength="8" placeholder="maxlenth is 8"/>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="给erye个账号吧"/>
				</td>
			</tr>
		</table>
	</form>
</body>

<script type="text/javascript">
/* 确定rest风格，参数是delete还是put */
function adjustRest(delOrUp,_method) {
	var adjust=document.getElementById(delOrUp);
	var method=document.getElementById(_method);
	if(adjust.value=='删除') {
		method.value='delete';
	}else if(adjust.value=='修改') {
		method.value='put';
	}
}
</script>

</html>