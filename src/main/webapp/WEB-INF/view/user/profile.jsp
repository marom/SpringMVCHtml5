<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: maro
  Date: 10/05/16
  Time: 18:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Profile</title>
</head>
<body>
<h2>User Profile</h2>

<security:authorize access="hasAnyRole('ROLE_ADMIN','ROLE_SUPER_USER', 'ROLE_USER')" var="isUSer"/>
<font size="3" color="green"><b>
    <c:if test="${isUSer}">You are logged in as
        <security:authentication property="principal.username"/> with the role of: <b>
            <security:authentication property="principal.authorities"/></b>
    </c:if></b>
</font>
<br/>
<a href="${pageContext.request.contextPath}">Index</a>
<a href="javascript:history.back()">Back</a>
</body>
</html>
