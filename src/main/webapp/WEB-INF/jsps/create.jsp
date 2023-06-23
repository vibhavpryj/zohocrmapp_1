<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="Menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create</title>
</head>
<style>
  body {background-color: powderblue;}
  h1 {color: red;}
  p {color: blue;}
</style>

<body>
<h2>Leads | create</h2>
	<form action="saveleads" method="post">
											<pre>
									First Name<input type="text" name="firstName" /><br/>
									Last Name<input type="text" name="lastName" /><br/>
									Email <input type="text" name="email" /><br/>
									Mobile <input type="text" name="mobile" /><br/>
									Source:
									<select name="source">
									  <option value="news paper">News paper</option>
									  <option value="online">Online</option>
									  <option value="offline">Offline</option>
									  <option value="Friend">Friend</option>
									</select>
									<input type = "submit" value ="save"/>
											</pre>

	</form>
</body>
</html>