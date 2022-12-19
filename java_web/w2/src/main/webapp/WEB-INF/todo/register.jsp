<%--
  Created by IntelliJ IDEA.
  User: kimjihwan
  Date: 2022/12/19
  Time: 12:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <form action="/todo/register" method="post">
    <div>
      <input type="text" name="title" placeholder="INSERT TITLE"/>
    </div>
    <div>
      <input type="date" name="dueDate">
    </div>
    <div>
      <button type="reset">RESET</button>
      <button type="submit">REGISTER</button>
    </div>
  </form>
</body>
</html>
