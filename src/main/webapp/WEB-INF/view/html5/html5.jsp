<%--
  Created by IntelliJ IDEA.
  User: maro
  Date: 11/05/16
  Time: 07:27
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Sample HTML5 Layout</title>
    <link href="${pageContext.request.contextPath}/resources/css/html5style.css" rel="stylesheet" />
</head>
<body>
    <header>
        <h1>HEADER header HEADER</h1>
    </header>
<nav>
    <ul>
        <li><a href="${pageContext.request.contextPath}/">Home</a></li>
    </ul>
</nav>

    <section>
        <h1>Section starts here </h1>
        <article>
            <h4>Article</h4>
        </article>

        <article>
            <b>Article</b>
            <h1>autofocus example</h1>
            <form>
                <table>
                    <tr><td>Title:</td><td><input name="title"></td></tr>
                    <tr><td>Name:</td><td><input name="name" autofocus></td></tr>
                    <tr><td>Surname:</td><td><input name="surname"></td></tr>
                    <tr><td><input type="submit" value="Submit Details"/></td></tr>
                </table>
            </form>
        </article>

        <article>
            <b>Article</b>
            <h1>placeholder example</h1>
            <form>
                <table>
                    <tr><td>Title:</td><td><input name="title" placeholder="Please enter your title here" style="width: 250px" ></td></tr>
                    <tr><td>Name:</td><td><input name="name" placeholder="Please enter your name here" style="width: 250px"></td></tr>
                    <tr><td>Surname:</td><td><input name="surname" placeholder="Please enter your surname here" style="width: 250px" ></td></tr>
                    <tr><td><input type="submit" value="Submit Details"/></td></tr>
                </table>
            </form>
        </article>
        <article>
            <b>Article</b>
            <h1>required example</h1>
            <form>
                <table>
                    <tr><td>Title:</td><td><input name="title" placeholder="Please enter your title here" style="width: 250px" required="required"></td></tr>
                    <tr><td>Surname:</td><td><input name="surname" placeholder="Please enter your surname here" style="width: 250px" ></td></tr>
                    <tr><td><input type="submit" value="Submit Details"/></td></tr>
                </table>
            </form>
        </article>

        <article>
            <b>Article</b>
            <h1>input type email example</h1>
            <form>
                <table>
                    <tr><td>Title:</td><td><input name="title" placeholder="Please enter your title here" style="width: 250px" ></td></tr>
                    <tr><td>Name:</td><td><input name="name" placeholder="Please enter your name here" style="width: 250px"></td></tr>
                    <tr><td>Email:</td><td><input type="email" placeholder="Please enter your email here" style="width: 250px" required="required"></td></tr>
                    <tr><td>Surname:</td><td><input name="surname" placeholder="Please enter your surname here" style="width: 250px" ></td></tr>
                    <tr><td><input type="submit" value="Submit Details"/></td></tr>
                </table>
            </form>
        </article>
        <article>
            <b>Article</b>
            <h1>input pattern example</h1>
            <form>
                <table>
                    <tr><td>Phone number:</td><td><input name="phone" pattern="[(][0-9]{3}[)][0-9]{7}" title="(123)4567890" style="width: 250px" required="required"></td></tr>
                    <tr><td><input type="submit" value="Submit"/></td></tr>
                </table>
            </form>
        </article>
        <article>
            <b>Article</b>
            <h1>input URL example</h1>
            <form>
                <table>
                    <tr><td>URL:</td><td>
                        <input style="width: 400px" name="url" pattern="https?://.+" title="Please enter URL" required="required"/></td></tr>
                    <tr><td><input type="submit" value="Submit"/></td></tr>

                </table>
            </form>
        </article>
        <article>
            <b>Article</b>
            <h1>input datalist example</h1>
            <label>Go to browser list:
                <input name="browsers" type="text" list="suggestions"></label>
            <datalist id="suggestions">
                <option value="CR"  label="Chrome">
                <option value="FI"  label="Firefox">
                <option value="IE"  label="Internet Explorer">
            </datalist>
        </article>
    </section>
    <footer>
        <h1>FOOTER</h1>
    </footer>
</body>
</html>
