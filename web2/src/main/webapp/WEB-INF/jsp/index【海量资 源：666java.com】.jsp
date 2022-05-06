<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/10/15
  Time: 12:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<table border="1" width="50%">
    <tr>
        <td>id</td>
        <td>name</td>
    </tr>
    <c:forEach items="${classRooms}" var="classRoom">
        <tr>
            <td>${classRoom.id}</td>
            <td>${classRoom.name}</td>
        </tr>
    </c:forEach>
</table>






</body>
</html>
