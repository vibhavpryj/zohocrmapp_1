<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="Menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead information</title>
</head>

<style>
  body {background-color: powderblue;}
  h1 {color: red;}
  p {color: blue;}
</style>
<body>
<h2>Lead Details</h2>
<hr>

<pre>
<b>
						First Name: =${lead.firstName}<br/>
						Last Name: =${lead.lastName}<br/>
						Email: =${lead.email}<br/>
						Mobile: =${lead.mobile}<br/>
						source: =${lead.source}<br/>
</b>
</pre>
<form action="sendEmail" method="post">
						<input type="hidden" name = "email" value="${lead.email}" />
						<input type="submit" value="Email"/>

</form><br>
<form action="convert" method="post">
						<input type="hidden" name = "id" value="${lead.id}" />
						<input type="submit" value="Convert"/>

</form>
</body>
</html>