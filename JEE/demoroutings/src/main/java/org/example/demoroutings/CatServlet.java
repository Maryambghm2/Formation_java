package org.example.demoroutings;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "catservlet", value = "/cat/*")
public class CatServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pathInfo = req.getPathInfo();

        System.out.println(pathInfo);

        switch (pathInfo) {
            case "/list":
                req.getRequestDispatcher("WEB/INF/list.jsp").forward(req,resp);
            case "/add":
                req.getRequestDispatcher("WEB/INF/form.jsp").forward(req,resp);
            case "/404":
                req.getRequestDispatcher("WEB/INF/404.jsp").forward(req,resp);
        }
    }
}


