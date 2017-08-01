<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页面</title>
<script type="text/javascript">
function hello() {
	alert("我是安小猪！");
}
</script>
</head>
<body>
<div align="center">
	<img src="<%=request.getContextPath()%>/static/images/pig.jpg" style="width: 120px;height: 160px">
</div>
<div align="center">
	<h1 onclick="hello()"><a href="" style="text-decoration:none">小安同志</a></h1>
</div>
<div align="center" style="margin-top: 10px">
	<form action="<%=request.getContextPath()%>/family/account/login" method="post">
		<table align="center" border="1px">
			<tr>
				<td>
					用户名：
				</td>
				<td>
					<input type="text" name="name" value=""/>
				</td>
			</tr>
			<tr>
				<td>
					密码：
				</td>
				<td>
					<input type="password" name="password" value=""/>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="登录"/>
				</td>
			</tr>
		</table>
	</form>
</div>
</body>
</html>