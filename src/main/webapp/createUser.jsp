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
        <label>
            <input type="text" name="login">
        </label>
    </p>
    <p>Password
        <label>
            <input type="password" name="login">
        </label>
    </p>
    <p>Email
        <label>
            <input type="text" name="email">
        </label>
    </p>
    <p>Is Male?
        <label>
            <input type="checkbox" value="false" name="isMale">
        </label>
    </p>

    <input type="submit" name="submit">
</form>
</body>
</html>
