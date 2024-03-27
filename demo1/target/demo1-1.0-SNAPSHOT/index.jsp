<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>

</h1>
<br/>
<form action="hello-servlet" method="get">
    <input type="number" name="number">
    <input type="submit" value="Показати таблицю">
</form>
<h1>Гра "Вгадай число"</h1>
<form action="GuessNumberServlet" method="post">
    <label for="userNumber">Загадайте число від 0 до 100:</label><br>
    <input type="text" id="userNumber" name="userNumber"><br>
    <input type="submit" value="Підтвердити"><br>
</form>
<form action="Anketa" method="post">
    <label for="userF">Фамілія</label><br>
    <input type="text" id="userF" name="userF"><br>
    <label for="userI">Ім'я</label><br>
    <input type="text" id="userI" name="userI"><br>
    <label for="userO">По-батькові</label><br>
    <input type="text" id="userO" name="userO"><br>
    <label for="age">Вік</label><br>
    <input type="number" id="age" name="age"><br>
    <label for="phone">Телефон</label><br>
    <input type="number" id="phone" name="phone"><br>
    <label for="email">E-mail</label><br>
    <input type="email" id="email" name="email"><br>
    <label for="box">Хочете підписатися на нашу розсилку?</label><br>
    <input type="checkbox" id="box" name="newBox"><br>
    <input type="submit" value="Підтвердити"><br>

</form>

</body>
</html>