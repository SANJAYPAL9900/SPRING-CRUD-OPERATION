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

	<c:if test="${not empty errorMsg}">
		<h4 style="color: red">${errorMsg}</h4>
	</c:if>

	<form action="loginForm" method="post">
		Email: <input type="text" name="email"> <br> <br>
		Password: <input type="password" name="password"> <br> <br>
		<input type="submit" value="Login">
	</form>
	<br>
	<br> 
	If not registered...<a href="regPage"><b>Click here</b></a>
	
</body>
</html>