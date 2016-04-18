<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: maro
  Date: 18/04/16
  Time: 10:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>REST</title>
</head>
<body>

<c:url value="/posts" var="RestTemplateControllerExamplePosts" />
<c:url value="/posts/1" var="RestTemplateControllerExamplePosts1" />
<c:url value="/responseStatusError" var="RestTemplateControllerExampleResponseStatusError" />
<%--<c:url value="/getAllDBLogsXML" var="RestControllerGetAllDBLogsXML" />--%>
<%--<c:url value="/getAllDBLogsJSON" var="RestControllerGetAllDBLogsJSON" />--%>
<h1><b>REST calls</b></h1>

<br/>
<br/>
<a href="${RestTemplateControllerExamplePosts}">@RestTemplateControllerExample/posts</a><br/>
calling with the value : <b>${RestTemplateControllerExamplePosts}</b>
<br/>
<br/>
</body>
</html>
