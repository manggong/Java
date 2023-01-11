<%--
  Created by IntelliJ IDEA.
  User: kimjihwan
  Date: 2023/01/11
  Time: 3:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table>
        <thead>
            <tr>
                <th>tno</th>
                <th>title</th>
                <th>writer</th>
                <th>dueDate</th>
                <th>finished</th>
            </tr>
        </thead>
        <tbody>
        <c:forEach items="${dtoList}" var="dto">
            <tr>
                <th scope="row"><c:out value="${dto.tno}"/></th>
                <td><c:out value="${dto.title}"/></td>
                <td><c:out value="${dto.writer}"/></td>
                <td><c:out value="${dto.dueDate}"/></td>
                <td><c:out value="${dto.finished}"/></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</body>
</html>
