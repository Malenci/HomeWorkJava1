package org.example.demo1;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "GuessNumberServlet", value = "/GuessNumberServlet")
public class GuessNumberServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String userNumberStr = request.getParameter("userNumber");

        if (userNumberStr == null || userNumberStr.isEmpty()) {
            out.println("<p>Будь ласка, введіть число.</p>");
            return;
        }

        int userNumber = Integer.parseInt(userNumberStr);
        int guessedNumber = (int) (Math.random() * 100);

        out.println("<h2>Ви ввели число " + userNumber + "</h2>");
        out.println("<h2>Число яке загадав комп'ютер " + guessedNumber + "</h2>");

        if (userNumber == guessedNumber) {
            out.println("<h2>Вітаємо! Ви вгадали число!</h2>");
        } else {
            out.println("<h2>На жаль, це не правильне число. Спробуйте ще раз!</h2>");
        }
    }

    public void destroy() {
    }
}
