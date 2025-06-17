<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 11/06/2025
  Time: 11:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Formulaire</title>
</head>
<body>
<h1>Formulaire</h1>
<form action="form" method="post">
    <div>
        <label for="firstname">Firstname:</label>
        <input type="text" name="firstname" id="firstname">
    </div>

    <div>
        <label for="lastname">Lastname:</label>
        <input type="text" name="lastname" id="lastname">
    </div>

    <div>
        <label for="age">Age:</label>
        <input type="text" name="age" id="age">
    </div>
    <button>Ajouter</button>
</form>
</body>
</html>
