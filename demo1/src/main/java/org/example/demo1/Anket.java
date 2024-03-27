package org.example.demo1;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Anketa", value = "/Anketa")
public class Anket extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String userF = request.getParameter("userF");
        String userI = request.getParameter("userI");
        String userO = request.getParameter("userO");
        int age = Integer.parseInt(request.getParameter("age"));
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String newBox = request.getParameter("newBox");
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Інформація про користувача</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Інформація про користувача:</h1>");
        out.println("<p>Прізвище: " + userF + "</p>");
        out.println("<p>Ім'я: " + userI + "</p>");
        out.println("<p>По-батькові: " + userO + "</p>");
        out.println("<p>Вік: " + age + "</p>");
        out.println("<p>Телефон: " + phone + "</p>");
        out.println("<p>E-mail: " + email + "</p>");
        out.println("<p>Підписка на розсилку: " + (newBox != null ? "Так" : "Ні") + "</p>");
        out.println("</body>");
        out.println("</html>");
    }
    }
