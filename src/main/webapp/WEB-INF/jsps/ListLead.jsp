<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="Menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index leadList</title>
</head>
<style>
  body {background-color: powderblue;}
  h1 {color: red;}
  p {color: blue;}
</style>

<body>
	<h2>List of all leads record!!!!</h2>
	
	<table>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Source</th>
		</tr>

		<c:forEach var="lead" items="${list}">
			<tr>
				<td><a href="leadInfo?id=${lead.id}">${lead.firstName}</a></td>
				<td>${lead.lastName}</td>
				<td>${lead.email}</td>
				<td>${lead.mobile}</td>
				<td>${lead.source}</td>
			</tr>


		</c:forEach>

	</table>
</body>
</html>