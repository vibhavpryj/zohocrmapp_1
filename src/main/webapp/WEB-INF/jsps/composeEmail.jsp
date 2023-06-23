<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ include file="Menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Email</title>
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
	<h2>Email</h2>
	<form action="Send" method="post">
		To:<input type="email" name="to" value="${email}" />
		 Subject:<input type="text" name="sub" />
		<textarea name="msg" rows="20" cols="20"></textarea>
		<input type="submit" value="Send" />
	</form>
	${mss}
</body>
</html>