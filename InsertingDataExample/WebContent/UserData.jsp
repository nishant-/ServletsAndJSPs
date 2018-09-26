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
<html:form action="/UserData">
<bean:message key="user.name"/><html:text property="name"></html:text><br>
<bean:message key="user.email"/><html:text property="email"></html:text><br>
<bean:message key="user.age"/><html:text property="age"></html:text><br>
<bean:message key="user.sex"/>  M:<html:checkbox property="sex" value="Male"></html:checkbox> F:<html:checkbox property="sex" value="Female"></html:checkbox><br>
<html:submit value="Save"/>
</html:form>
</body>
</html>