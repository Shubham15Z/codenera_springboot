<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Data</h1>
	<table border = "2">
		<tr> 
			<th>Srno</th>
			<th>Compnay Name</th> 
			<th>Role</th>
 			<th>Joining Date</th>
 			<th>Last Date</th>
 			<th>Edit</th>
 			<th>Delete</th>
 		</tr>
 		<c:forEach var="emp" items = "${exp_data_li}">
 		<tr> 
 			<td> ${emp.srno} </td>
 			<td>${emp.companyName}</td>
 			<td>${emp.role} </td>
 			<td>${emp.dateOfJoining}</td>
 			<td>${emp.lastDate}</td>
 			<td><a href="/${emp.srno}">Edit</a></td>
 			<td><a href="/delete/${emp.srno}">Delete</a></td>
 		</tr>
 		</c:forEach>
</table>
</body>
</html>