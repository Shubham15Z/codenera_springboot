<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Login here</h1>
	<form method="post" action="/login">
		Username : <input type="email" name="email" placeholder="Enter email"><br><br>
		Password : <input type="password" name="password" placeholder="Enter password"><br><br>
		<input type="submit" value="Login">
	</form>
</body>
</html>