<%@page import="com.training.pkg.model.Alien"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>This is the tittle of inner page!</title>
</head>
<body bgcolor="cyan">
	
	<%
		Alien a1= (Alien)request.getAttribute("alien");
		out.println(a1);
	%>

</body>
</html>