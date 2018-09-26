<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Feedback Form</title>
</head>
<body>
<b>Feedback Successfully Submitted.</b>

You have submitted the following feedback.
<table>
    <tr>
        <td>
            Name :
        </td>
        <td>
            <bean:write name="TagForm" property="name" />
        </td>
    </tr>
    <tr>
        <td>
            Sex :
        </td>
        <td>
            <logic:equal name="TagForm" property="sex" value="M"> Male </logic:equal>
            <logic:equal name="TagForm" property="sex" value="F"> Female </logic:equal>
        </td>
    </tr>
    <tr>
        <td>
            Comments :
        </td>
        <td>
            <bean:write name="TagForm" property="comments" />
        </td>
    </tr>
</table>
</body>
</html>

