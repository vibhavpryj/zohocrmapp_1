<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ include file="Menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index Bill</title>
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
	<h2>
		<b>Make Lead Bills Here!!!!!</b>
	</h2>
	<hr>
	<form action="savebill" method="post">
		<pre>
						First Name:-		<input type="text" name="firstName"value="${Con.firstName}" /><br>
								
						Last Name:- 		<input type="text" name="lastName" value="${Con.lastName}" /><br>
						Email:-			<input type="text" name="email" value="${Con.email}" /><br>
						Mobile:- 		<input type="number" name="mobile" value="${Con.mobile}" /><br>
						Product:-		<input type="text" name="productName" /><br>
						Quantity:-		<input type="number" name="quantity" /><br>
						Cost of product:-	<input type="number" name="cost" /><br>
										<input type="submit" value="Save Bill" />
</pre>
	</form>
</body>
</html>