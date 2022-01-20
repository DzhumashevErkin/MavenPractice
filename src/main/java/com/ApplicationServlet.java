package com;

import com.db.DateBase;
import com.model.Application;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/application")
public class ApplicationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("application.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Application app = new Application();
        app.setFullName(req.getParameter("fullName"));
        app.setCourse(req.getParameter("course"));
        app.setEmail(req.getParameter("email"));
        app.setOnline(req.getParameter("isOnline").equals("true"));

        boolean res = DateBase.addApplication(app);
    }
}
