<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="org.kevinjang.LoginServlet.dto.User" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Successful</title>
</head>
<body>
	<h3>You have been logged in successfully</h3>
	
	<jsp:useBean id="user" class="org.kevinjang.LoginServlet.dto.User" scope="request"></jsp:useBean>
	
	Welcome back, <%=user.getFullName() %>!
</body>
</html>