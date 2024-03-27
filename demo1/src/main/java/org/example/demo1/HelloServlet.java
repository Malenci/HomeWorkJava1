package org.example.demo1;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import static java.lang.System.out;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Таблиця множення для числа: ";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String numberStr = request.getParameter("number");
        int number = 0;
        try {
            number = Integer.parseInt(numberStr);
        } catch (NumberFormatException e) {
            out.println("<html><head><title>Помилка</title></head><body>");
            out.println("<h2>Помилка: Будь ласка, введіть ціле число.</h2>");
            out.println("</body></html>");
            return;
        }
        out.println("<html><head><title> Таблиця Множення</title></head><body>");

        out.println("<h2>" + message + number + "</h2>");
        out.println("<table border='1'>");
        for (int i = 1; i <= 10; i++) {
            out.println("<tr><td>" + number + " * " + i + "</td><td>" + (number * i) + "</td></tr>");
        }
        out.println("</table></body></html>");


    }
    public void destroy() {
    }

}
