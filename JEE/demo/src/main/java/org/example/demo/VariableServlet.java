package org.example.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "variableServlet", value = "/variables")
public class VariableServlet extends HttpServlet {
    private String prenom;
    private String nom;
    private List<String> prenoms;

    @Override
    public void init() throws ServletException {
        prenom = "toto";
        nom = "tata";
        prenoms = new ArrayList<>();
        prenoms.add("titi");
        prenoms.add("Toti");
        prenoms.add("Vivien");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("le nom", nom);
        req.setAttribute("le prénom", prenom);
        req.setAttribute("prénoms: ",prenoms);
        req.getRequestDispatcher("/variables.jsp").forward(req, resp);
    }
}
