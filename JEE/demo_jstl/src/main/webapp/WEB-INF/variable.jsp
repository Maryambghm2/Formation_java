<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 12/06/2025
  Time: 16:43
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h3>La balise c:if</h3>
<c:if test="${isTrue}">
    <p>La valeur est vrai !!!</p>
</c:if>
<c:if test="${isFalse}">
    <p>La valeur est fausse !!!</p>
</c:if>

<h3>La balise c:out</h3>
<p><c:out value="${nameDemo}" default="Au cas ou !!"/></p>
<p><c:out value="${nameInconnu}" default="Au cas ou une valeur par defaut!!"/></p>

<h3>La balise c:forEach</h3>
<c:forEach var="prenom" items="${prenoms}">
    <p>${prenom}</p>
</c:forEach>

<h3>La balise c:import</h3>
<c:import url="madiv.html"/>

<h3>Les balises c: choose c:when c:othewise</h3>

<c:choose>
    <c:when test="${isFalse}">
        <p>J'affiche le premier pargraphe</p>

    </c:when>
    <c:when test="${isFalse}">
        <p>J'affiche le second pargraphe</p>

    </c:when>
    <c:otherwise>
        <p>Aucune des valeurs précédentes est vrai</p>
    </c:otherwise>
</c:choose>
</body>
</html>
