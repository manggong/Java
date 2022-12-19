<%--
  Created by IntelliJ IDEA.
  User: kimjihwan
  Date: 2022/12/19
  Time: 9:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:if test="${param.result == 'error'}">
        <h1>Login Error!</h1>
    </c:if>
    <form action="/login" method="post">
        <input type="text" name="mid">
        <input type="password" name="mpw">
        <input type="checkbox" name="auto">
        <button type="submit">LOGIN</button>
    </form>
</body>
</html>
