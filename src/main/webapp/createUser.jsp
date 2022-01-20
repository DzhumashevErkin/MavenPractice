<%--
  Created by IntelliJ IDEA.
  User: Erkin
  Date: 20.01.2022
  Time: 22:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>DZApplication</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/createUser" method="post">
        <p>Login
            <input type="text" name="login">
        </p>
        <p>Password
            <input type="password" name="login">
        </p>
        <p>Email
            <input type="text" name="email">
        </p>
        <p>Is Male?
            <input type="checkbox" value="false" name="isMale">
        </p>

        <input type="submit" name="submit">
    </form>
</body>
</html>
