<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit</title>
</head>
<body>
	<h1> Edit Data </h1>
	<c:set var = "ob" value = "${edit_data}"/>

	<form method = "post" action = "/edit/${ob.srno}">
								 <input type = "hidden" name="srno" value = "${ob.srno}">
		Company Name 		:	 <input type = "text" name = "companyName" value = "${ob.companyName}"> <br><br>
		Role 				:	 <input type = "text" name = "role" value = "${ob.role}"> <br><br>
		Date Of Joining 	:	 <input type = "text" name = "dateOfJoining" value = "${ob.dateOfJoining}"> <br><br>
		LastDate			:	 <input type = "text" name = "lastDate" value = "${ob.lastDate}"> <br><br>
								 <input type = "submit" value="Update"> <br><br>
	</form>
</body>
</html>