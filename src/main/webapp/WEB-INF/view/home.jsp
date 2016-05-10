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
        <a href="${callMethod}">Sample Controller</a>
        <br/>
        <br/>
        <c:url value="/controllerWithXmlConfig.html" var="controllerWithXMLConfig" />
        <a href="${controllerWithXMLConfig}">Controller With XML Config</a>
        <br/>
        <br/>
        <c:url value="/controllerclassnamehandlermapping.html" var="controllerClassNameMapping" />
        <a href="${controllerClassNameMapping}">ControllerClassNameHandlerMapping</a>
        <br/>
        <br/>
        <c:url value="/controllerBeanName.html" var="controllerBeanName"/>
        <a href="${controllerBeanName}">ControllerBeanNameUrlHandlerMapping</a>
        <br/>
        <br/>
        <c:url value="/file.html" var="file" />
        <a href="${file}">File Upload Excel and PDF examples</a>
        <br/>
        <br/>
        <c:url value="/jdbc.html" var="jdbc" />
        <a href="${jdbc}">JDBC with JdbcTemplates</a>
        <br/>
        <br/>
        <c:url value="/email.html" var="emailController" />
        <a href="${emailController}">Spring MVC Email (Velocity Email Templates)</a>
        <br/>
        <br/>
        <c:url value="/rest.html" var="rest" />
        <a href="${rest}">REST Webservices (JSON XML)</a>
        <br/>
        <br/>
        <c:url value="/orm.html" var="orm" />
        <a href="${orm}">ORM Hibernate Framework</a>
        <br/>
        <br/>
        <c:url value="/throwRunTimeException.html" var="throwRunTimeException" />
        <a href="${throwRunTimeException}">Exception Handler</a>
        <br/>
        <br/>
        <c:url value="/redirectExample.html" var="redirect" />
        <a href="${redirect}">Redirect example</a>
        <br/>
        <br/>
        <c:url value="/scope.html" var="scope" />
        <a href="${scope}">Scope examples</a>
        <br/>
        <br/>

    </div>
</body>
</html>
