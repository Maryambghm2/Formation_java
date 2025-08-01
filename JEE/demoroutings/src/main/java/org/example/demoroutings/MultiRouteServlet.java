package org.example.demoroutings;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "multirouteservlet", value = {"/multi-routes", "/multi", "/multi/*"})
public class MultiRouteServlet extends HttpServlet {
    private List<String> prenoms;

    @Override
    public void init() throws ServletException {
        prenoms = new ArrayList<>();
        prenoms.add("John");
        prenoms.add("Janne");
        prenoms.add("Toto");
        prenoms.add("Tata");
        prenoms.add("titi");
        prenoms.add("huhu");
        prenoms.add("haha");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pathInfo = (req.getPathInfo() != null && !req.getPathInfo().isEmpty()) ? req.getPathInfo() : "";

        String searchName = "";
        // Si j'ai autre chose que "" dans mon pathinfo alors je vais récuperer les infos
        if (!pathInfo.isEmpty()) {
            System.out.println("Path info obtenue :" + pathInfo);
            // pathinfo sans le / (premier caractere)

            System.out.println("Path info sans le / au debut :" + pathInfo.substring(1));


            // Integer parseint pour transformer la chaine de caractère
            System.out.println("path info en integer a partir d'un string :" + Integer.parseInt(pathInfo.substring(1)));
            searchName = prenoms.get(Integer.parseInt(pathInfo.substring(1)));

        }

        req.setAttribute("pathInfo", pathInfo);
        req.setAttribute("searchName", searchName);
        req.getRequestDispatcher("/multi.jsp").forward(req, resp);
    }

}