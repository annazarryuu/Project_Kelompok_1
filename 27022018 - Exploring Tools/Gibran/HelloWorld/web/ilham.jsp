<%-- 
    Document   : index
    Created on : Feb 27, 2018, 12:04:21 PM
    Author     : Gibran
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Web Lain</title>
</head>
<body>
	<%
		String nama = "Ilham Gibran";

		out.println("<h1> Hello " + nama + "</h1>");
		out.println("<br/> <a href='index.jsp'>Back to Index</a>");
	%>
</body>
</html>