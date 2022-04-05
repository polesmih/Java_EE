package servlet;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "HomeworkServlet", urlPatterns = "/hw1_servlet")

public class HomeworkServlet extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(FirstServlet.class);


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        ArrayList <Product> products = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            products.add(i, new Product(i, "Product-" + (i + 1), (i + 1)));
        }

        logger.info("Products");
        resp.getWriter().printf("<h1>Products:</h1>");

        for (int i = 0; i < 10; i++) {
            resp.getWriter().printf("<p>" + products.get(i) + "</p>");
        }

    }

//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
//            throws ServletException, IOException {
//        logger.info("Products");
//        resp.getWriter().printf("<h1>Products:</h1>");
//    }
}

