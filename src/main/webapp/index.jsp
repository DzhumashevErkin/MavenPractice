<html>
<body>
<H1>
    guys, it seems <i>TOMCAT</i> finally worked
    <% int a = 100;
        int b = 200; %>
    <%= a + b%>
</H1>

<p>
    <h1>${myAttr}</h1>
</p>

<p>
    <%=request.getParameter("fio")%>
    <%=request.getParameter("profile")%>
</p>
</body>
</html>

