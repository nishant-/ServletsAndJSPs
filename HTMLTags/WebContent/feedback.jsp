<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Feedback Form</title>
</head>
<body>
<b>Feedback Form</b>
<hr>
<html:form action="/TagAction">
<table>
    <tr>
        <td>
            Name :
        </td>
        <td>
            <html:text name="TagForm" property="name" />
        </td>
    </tr>
    <tr>
        <td>
            Sex :
        </td>
        <td>
            <html:radio name="TagForm" property="sex" value="M" >
            M </html:radio>
            <html:radio name="TagForm" property="sex" value="F" >
            F </html:radio>
        </td>
    </tr>
    <tr>
        <td>
            Comments :
        </td>
        <td>
            <html:textarea cols="20" rows="5" name="TagForm"
            property="comments" />
        </td>
    </tr>
    <tr>
        <td>
            <html:submit />
        </td>
        <td>
            <html:reset />
        </td>
    </tr>
</table>
</html:form>
</body>
</html>