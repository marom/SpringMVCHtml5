<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>

<%--
  Created by IntelliJ IDEA.
  User: maro
  Date: 14/04/16
  Time: 12:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Java Spring MVC Framework with AngularJS by Google and HTML5 </title>
</head>
<body>
    <div>
        <br/>
        <c:url value="/callMethod" var="callMethod" />
        <a href="${callMethod}">Sample Controller</a><br/>
        <br/>
        <c:url value="/controllerWithXmlConfig.html" var="controllerWithXMLConfig" />
        <a href="${controllerWithXMLConfig}">Controller With XML Config</a><br/>
    </div>
</body>
</html>
