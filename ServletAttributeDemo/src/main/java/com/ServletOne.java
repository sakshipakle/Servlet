package com;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/ServletOne")
public class ServletOne extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ServletOne() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter p = response.getWriter();
		//Request scope
		String n = request.getParameter("uname");
		// p.print("Welcome "+n);
		System.out.println("Welcome "+n);
		request.setAttribute("surname", "Pakle");
		//Session scope
		HttpSession s1 = request.getSession();
	    s1.setAttribute("dname", "Admin");
	    //Appli
	    ServletContext c = getServletContext();
	    c.setAttribute("sname", "Prathamesh");
	    
	    request.getRequestDispatcher("ServletTwo").forward(request, response);
	}

}
