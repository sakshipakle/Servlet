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


@WebServlet("/ServletTwo")
public class ServletTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ServletTwo() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			response.setContentType("text/html");
			PrintWriter p = response.getWriter();
			
			String n = (String)request.getParameter("uname");
			String p1 = (String)request.getAttribute("surname");
			p.print("Hello "+n+  " "+p1);
			
			HttpSession s1 = request.getSession(true);
			String s = (String) s1.getAttribute("dname");
			//p.print(" "+s);
			
			ServletContext c = getServletContext();
			String x = (String) c.getAttribute("sname");
			p.print(" "+x);
			
			p.close();			
	}

}
