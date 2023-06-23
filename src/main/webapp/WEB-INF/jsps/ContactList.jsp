<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="Menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index ContactList</title>
</head>
<style>
body {
	background-color: powderblue;
}

h1 {
	color: red;
}

p {
	color: blue;
}
</style>
<body>
	<h2>List of all Contacts record!!!!</h2>
	<table>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Source</th>
			<th>Billing</th>
		</tr>

		<c:forEach var="con" items="${Contact}">
			<tr>
				<td>${con.firstName}</td>
				<td>${con.lastName}</td>
				<td>${con.email}</td>
				<td>${con.mobile}</td>
				<td>${con.source}</td>
				<td><a href="billing?id=${con.id}"><input type = "button" value="Make Bill"></a></td>
			</tr>


		</c:forEach>

	</table>
</body>
</html>