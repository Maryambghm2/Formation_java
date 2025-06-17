<%@ page import="java.util.Date" %>
<%@ page import="java.time.LocalDate" %><%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 10/06/2025
  Time: 14:38
  To change this template use File | Settings | File Templates.
--%>
<jsp:useBean id="leprenom" type="java.lang.String" scope="request"/>
<jsp:useBean id="prenoms" type="java.util.ArrayList<java.lang.String>" scope="request"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Affichage des variables</h1>
<%-- En utilisant le language El --%>
<h2>Bonjour ${lenom}</h2>

<%-- En utilisant le language El Expresion languaeg avec usebean--%>
<h2>Bonjour ${leprenom.toUpperCase()}</h2>

<%-- Avec Scriptlet JSP --%>
<% for (String p: prenoms) {%>
<p><%= p %></p>
<p><%= new Date() %></p>
<p><%= LocalDate.now() %></p>
<% } %>

<%@include file="maDiv.jsp"%>
</body>
</html>
