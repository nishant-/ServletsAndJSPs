<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
    <%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
    <%@taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<logic:present name="allData">
<p>These are our Regions</p>
<table border="1">
<thead>
<tr>
<th><bean:message key="region.id"/></th>
<th><bean:message key="region.name"/></th>
</tr>
</thead>
<tbody>
<logic:iterate id="region" name="allData">
<tr>
<td><bean:write name="region" property="regionId"/></td>
<td><bean:write name="region" property="regionName"/></td>
</tr>
</logic:iterate>
</tbody>
</table>
</logic:present>

</body>
</html>