<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!-- Static Inclusion during translation of page-->
<%@include file="toBeIncluded.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
  	<title>Date</title>
  </head>
  <body>
  	<p>Today's date: <%= (new java.util.Date()).toLocaleString()%></p>
  	<!-- Inclusion during page's request -->
  	<jsp:include page="toBeIncluded.jsp"/>
  	<jsp:forward page="forwarding.jsp"/>
  </body>
</html>