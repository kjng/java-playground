<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Registration</title>
</head>
<body>
	<form action="process.jsp" method="post">
		<label>Username <input type="text" name="username" /></label>
		<br>
		<label>Password <input type="password" name="password" /></label>
		<br>
		<label>Full Name <input type="text" name="fullName" /></label>
		<br>
		<label>Address Line 1 <input type="text" name="address1" /></label>
		<br>
		<label>Address Line 2 <input type="text" name="address2" /></label>
		<br>
		<label>City <input type="text" name="city" /></label>
		<br>
		<label>State <input type="text" name="state" /></label>
		<br>
		<label>Pin Number <input type="password" name="pincode" /></label>
		<br>
		<input type="submit" value="Log In" />
	</form>
</body>
</html>