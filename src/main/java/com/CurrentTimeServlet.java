package com;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTimeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        SimpleDateFormat formatter= new SimpleDateFormat("HH:mm:ss z, yyyy-MM-dd");
        Date date = new Date(System.currentTimeMillis());
        out.print("<h1> "+ formatter.format(date) +" </h1>");
    }
}
