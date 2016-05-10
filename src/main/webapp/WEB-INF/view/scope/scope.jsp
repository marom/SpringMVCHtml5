<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: maro
  Date: 10/05/16
  Time: 12:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Scope Calls</title>
</head>
<body>
<c:url value="/scopeSession" var="scopeSession" />
<c:url value="/invalidate" var="invalidate" /><br/><br/>
<a href="${scopeSession}">Session Scope Call</a><br/>
<a href="${invalidate}">Session Invalidate Call</a><br/>

<h1><b>Scope Calls</b></h1><br/>
<b>SessionScope attribute:</b> ${sessionScope.sessionObject}<br/>

</body>
</html>
