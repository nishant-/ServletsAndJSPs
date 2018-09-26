<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello World</title>
</head>
<body>
<h1>Hello World</h1>
<br>
the time is now <%= new java.util.Date() %>
<%
System.out.println("Time is not constant");
out.println("Time is not constant");
out.println();
out.println(request.getRemoteHost());
//response.sendRedirect("http://www.google.com");
%>
<table border="2">
<% 

for(int i=0;i<5;i++){
%>	
<tr>
<td>Number</td>
<td><%= i+1 %>	</td>
</tr>
	
<%} %>
</table>
</body>
</html>