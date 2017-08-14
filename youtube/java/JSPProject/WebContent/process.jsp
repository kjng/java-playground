<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Information</title>
</head>
<body>
	<jsp:useBean id="user" class="org.kevinjang.JSPProject.dto.User" scope="request">
		<jsp:setProperty property="*" name="user"></jsp:setProperty>
	</jsp:useBean>
	
	Hello, <jsp:getProperty property="fullName" name="user"/>!
	<div>
		Username: <jsp:getProperty property="username" name="user"/>
	</div>
	<div>
		Address 1: <jsp:getProperty property="address1" name="user"/>
	</div>
	<div>
		Address 2: <jsp:getProperty property="address2" name="user"/>
	</div>
	<div>
		City: <jsp:getProperty property="city" name="user"/>
	</div>
	<div>
		State: <jsp:getProperty property="state" name="user"/>
	</div>
	<div>
		Pin Number: <jsp:getProperty property="pincode" name="user"/>
	</div>
</body>
</html>