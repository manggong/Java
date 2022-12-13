<%--
  Created by IntelliJ IDEA.
  User: kimjihwan
  Date: 2022/12/13
  Time: 10:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>list Page</h1>
    <ul>
        <c:forEach var="dto" items="${list}">
            <li>${dto}</li>
        </c:forEach>
    </ul>
</body>
</html>
