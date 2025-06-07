<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome Employee</h1>
	<form action="/addexp" method="post">
		Company Name    : <input type="text" name="companyName" placeholder="Enter company name"><br><br>
		Role            : <input type="text" name="role" placeholder="Enter role"><br><br>
		Date of Joining : <input type="date" name="dateOfJoining"> <br><br>
		Last Date       : <input type="date" name="lastDate"><br><br>
						  <input type="submit" value="Add Experience">
	</form>
	<form action="/datafetch" method="post">
		<button type="submit">View Data</button>
	</form>
</body>
</html>