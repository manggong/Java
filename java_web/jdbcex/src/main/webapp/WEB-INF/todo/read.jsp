<%--
  Created by IntelliJ IDEA.
  User: kimjihwan
  Date: 2022/12/19
  Time: 12:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div>
        <input type="text" name="tno" value="${dto.tno}" readonly>
    </div>
    <div>
        <input type="text" name="tittle" value="${dto.title}" readonly>
    </div>
    <div>
        <input type="date" name="dueDate" value="${dto.dueDate}">
    </div>
    <div>
        <input type="checkbox" name="finished" value="${dto.finished ? "checked" : ""}" readonly>
    </div>
    <div>
        <a href="/todo/modify?tno=${dto.tno}">Modify</a>
        <a href="/todo/list">List</a>
    </div>
</body>
</html>
