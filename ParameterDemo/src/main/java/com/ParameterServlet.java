package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ParameterServlet")
public class ParameterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter pw = response.getWriter();  

        String name = request.getParameter("username");

        pw.println("<html><body>");
        pw.println("<h2>Using doGet</h2>");
        pw.println("<h2>Welcome " + name + "</h2>");
        pw.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter pw = response.getWriter();

        String name = request.getParameter("username");
        String pass = request.getParameter("upass");

        pw.println("<html><body>");
        pw.println("<h2>Using doPost</h2>");
        pw.println("<h2>Welcome " + name + "</h2>");
        pw.println("<h4>Your Password is: " + pass + "</h4>");
        pw.println("</body></html>");
    }
}