<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="Menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index list</title>
</head>
<style>
  body {background-color: powderblue;}
  h1 {color: red;}
  p {color: blue;}
</style>

<body>
	<h2>List of all bills</h2>
	<hr>
	<hr>
	<table>
		<tr>
			<th>First name</th>
			<th>Last name</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Product</th>
			<th>Quantity</th>
			<th>Cost</th>
		</tr>
		<c:forEach var="bill" items="${bills}">
			<tr>
				<td>${bill.firstName}</td>
				<td>${bill.lastName}</td>
				<td>${bill.email}</td>
				<td>${bill.mobile}</td>
				<td>${bill.productName}</td>
				<td>${bill.quantity}</td>
				<td>${bill.cost}</td>
			</tr>
		</c:forEach>
	</table>
	<h3>${msg}</h3>
</body>
</html>