<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: maro
  Date: 09/05/16
  Time: 13:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ORM Example</title>
</head>
<body>

<h1><b>ORM Hibernate JPA Examples</b></h1>
<c:url value="/ormFindAllUsers" var="ormFindAllUsers"/>
<c:url value="/ormUpdateUser" var="ormUpdateUser" />
<c:url value="/ormDeleteUser" var="ormDeleteUser" />
<c:url value="/ormInsertUser" var="ormInsertUser" />


<a href="${ormFindAllUsers}">ORMContoller ormFindAllUsers</a><br/><br/>
<a href="${ormUpdateUser}/iduser/1/enabled/false">ORMContoller ormUpdateUser</a><br/><br/>
<a href="${ormDeleteUser}/iduser/8">ORMContoller ormDeleteUser</a><br/><br/>
<a href="${ormInsertUser}/username/testuser/password/testpassword/enabled/true">ORMContoller ormInsertUser</a><br/><br/>

<c:if test="${not empty result}">
    Result: <c:if test="${result == 'true'}">
    <font color="green"><b>${result}</b></font>
</c:if>
    <c:if test="${result == 'false'}">
        <font color="red"><b>${result}</b></font>
    </c:if>
</c:if>

<c:if test="${not empty users}">
    <h2>ORM User List</h2>
    <table>
        <tr><b>Iduser: </b></tr>
        <tr><b>Username: </b></tr>
        <tr><b>Password: </b></tr>
        <tr><b>Enabled: </b></tr>
        <c:forEach var="user" items="${users}">
            <tr>
                <td><c:out value="${user.idUser}"/></td>
                <td><c:out value="${user.username}"/></td>
                <td><c:out value="${user.password}"/></td>
                <td><c:if test="${user.enabled == 'true'}">
                    <font color="green"><b><c:out value="${user.enabled}"/></b></font>
                    </c:if>
                    <c:if test="${user.enabled == 'false'}">
                        <font color="red"><b><c:out value="${user.enabled}"/></b></font>
                    </c:if>
                    <br/>
                </td>
            </tr>
        </c:forEach>
    </table>
</c:if>
<br/>
<a href="javascript:history.back()">Back</a>
</body>
</html>
