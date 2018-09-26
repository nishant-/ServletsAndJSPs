<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="WEB-INF/struts-html.tld" prefix="html" %>
<%@taglib uri="WEB-INF/struts-bean.tld" prefix="bean" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Details Saved Successfully</h2><br>
Name :  <bean:write name="DataForm" property="name"/><br>
Age  :  <bean:write name="DataForm" property="age"/><br>
Email:  <bean:write name="DataForm" property="email"/><br>
Sex  :  <bean:write name="DataForm" property="sex"/><br>
<html:form action="/back">
<html:submit value="Go Back"/>
</html:form>
</body>
</html>