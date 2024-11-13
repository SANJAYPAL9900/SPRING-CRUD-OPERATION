<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/style.css" />
</head>
<body class="body_bg">
	<h2>Register Here</h2>

	<c:if test="${not empty successMsg}">
		<h4 style="color: green">${successMsg}</h4>
	</c:if>

	<c:if test="${not empty errorMsg}">
		<h4 style="color: red">${errorMsg}</h4>
	</c:if>

	<form action="regForm" method="post">
		Name: <input type="text" name="name"> <br> <br>
		Email: <input type="text" name="email"> <br> <br>
		Phone: <input type="text" name="phone"> <br> <br>
		Password: <input type="password" name="password"> <br> <br>
		<input type="submit" value="Register">
	</form>
	<br>
	<br> If already registered...
	<a href="loginPage"><b>Click here</b></a>
</body>
</html>