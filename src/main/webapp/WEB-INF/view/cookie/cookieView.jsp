<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: maro
  Date: 10/05/16
  Time: 16:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cookie Example</title>
</head>
<body>
<c:url value="/writecookie" var="writeCookieController" />
<h1><b>Spring MVC writeCookieController Example</b></h1>
<a href="${writeCookieController}">CookieControllerExample writecookie</a>
<br/>

<c:url value="/readcookie" var="readCookieController" />
<h1><b>Spring MVC readCookieController Example</b></h1>
<a href="${readCookieController}">CookieControllerExample readcookie</a>
<br/>

<c:url value="/readAllCookies" var="readAllCookiesController" />
<h1><b>Spring MVC readAllCookiesController Example</b></h1>
<a href="${readAllCookiesController}">CookieControllerExample readAllCookies</a>
<br/><br/>

CookieValue: <b> ${cookieValue} </b> <br/> <br/>

</body>
</html>
