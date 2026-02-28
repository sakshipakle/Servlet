package com;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet("/ServletConfigClass")
public class ServletConfigClass extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public ServletConfigClass() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		ServletConfig sc = getServletConfig();
		String n = sc .getInitParameter("Name");
		
		pw.println("Your init parameter is : "+n);
		pw.close();
	}
  
}
