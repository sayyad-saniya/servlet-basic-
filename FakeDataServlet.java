package hello;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FakeDataServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html");  

        PrintWriter writer = resp.getWriter();

        Random random = new Random();

        writer.write("<ol>");

        for(int i = 0; i < 20; i++) {

            String cardNumber =
                    (random.nextFloat() + "").substring(2,6) + "-" +
                    (random.nextFloat() + "").substring(2,6) + "-" +
                    (random.nextFloat() + "").substring(2,6) + "-" +
                    (random.nextFloat() + "").substring(2,6);

            writer.write("<li>" + cardNumber + "</li>");
        }

        writer.write("</ol>");

        writer.flush();
        writer.close();
    }
}