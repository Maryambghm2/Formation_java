package org.example.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "monServlet", value = "/r")
public class MonServlet extends HttpServlet {
    private String prenom;

    @Override
    public void init() throws ServletException {
        System.out.println("monServlet est lancé !!! (message dans la methode init)");
        prenom = "TOTO";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Une requette GET  a été envoyé à /monservlet !!!");
        // reponse texte
        // resp.setContentType("text/plain");


        PrintWriter writer = resp.getWriter();
//      //  writer.println("du joli texte !!!");
//        writer.println("<h1>du joli texte !!!</h1>");
//

/*
        // reponse html
        resp.setContentType("text/html");
writer.println("<html><body>");
writer.println("<h1>"+ prenom+ "</h1>");
writer.println("<h2>Un joli titre</h2>");
writer.println("</body></html>");
*/

        // redirection vers une page jsp
        getServletContext().getRequestDispatcher("/maPage.jsp").forward(req, resp);
    }
}

