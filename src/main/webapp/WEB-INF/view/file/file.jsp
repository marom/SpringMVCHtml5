<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: maro
  Date: 14/04/16
  Time: 13:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring MVC FileUploadController Example</title>
</head>
<body>
<c:url value="/uploadFile" var="fileUploadControllerURL" />
<h1><b>Spring MVC FileUploadController Example</b></h1>	<br/>
<form action="${fileUploadControllerURL}" method="post" enctype="multipart/form-data">
    <table>
        <tr><td><b>File:</b></td><td><input type="file" name="file"></td><td><input type="submit" value="Press to upload the File"></td></tr>
    </table>
</form>
</body>
</html>
