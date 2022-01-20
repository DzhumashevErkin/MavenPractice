<%--
  Created by IntelliJ IDEA.
  User: Erkin
  Date: 20.01.2022
  Time: 15:19
  To change this template use File | Settings | File Templates.
--%>
<%@page pageEncoding="UTF-8" %>
<html>
    <head>

    </head>
    <body>
        <form action="${pageContext.request.contextPath}/application" method="post">
            <p>Full name
                <input type="text" name="fullName">
            </p>
            <p>Course name
                <select name = "course">
                    <option value="JAVA">JAVA</option>
                    <option value="PYTHON">PYTHON</option>
                    <option value="JAVASCRIPT">JAVASCRIPT</option>
                </select>
            </p>
            <p>Email
                <input type="text" name="email">
            </p>
            <p>Is Online?
                <input type="checkbox" value="true" name="isOnline">
            </p>

            <input type="submit" name="submit">
        </form>
    </body>
</html>
