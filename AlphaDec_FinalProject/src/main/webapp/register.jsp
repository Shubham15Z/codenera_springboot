<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> Register </h1>
	
	<form action = "/registration" method = "post">
	
	Name 				: <input type = "text" name = "name" placeholder="Enter name : "> <br><br>
	Email 				: <input type = "email" name = "email" placeholder="Enter email : "> <br><br>
	Phone 				: <input type = "number" name = "phone" placeholder="Enter phone : "> <br><br>
	Password			: <input type = "password" name = "password" placeholder="Enter password : "> <br><br>
	Confirm-Password	: <input type = "password" name = "cpassword" placeholder="Enter Confirm-Password : "> <br><br>
	<input type = "submit" value = "Register" >
	</form>
</body>
</html>