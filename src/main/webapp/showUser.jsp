<%--
  Created by IntelliJ IDEA.
  User: Erkin
  Date: 20.01.2022
  Time: 22:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>${user}</h1>
    <h1>${user.getLogin()}</h1>
    <h1>${user.getPassword()}</h1>
    <h1>${user.getEmail()}</h1>
    <h1>${user.isMale()}</h1>
</body>
</html>
