package day;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/LifeCycleDemo")
public class LifeCycleDemo extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    String msg;

    public void init(ServletConfig config) throws ServletException {
        System.out.println("Init method executed");
        msg = "Welcome ";
    }

    public void destroy() {
        System.out.println("Destroy method executed");
    }

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {

        /*response.setContentType("text/html");

        PrintWriter pw = response.getWriter();
        pw.println("<html><body>");
        pw.println(msg + "Service method executed");
        pw.println("</body></html>");
        pw.close();*/
    	
    	if(request.getMethod().equalsIgnoreCase("GET"))
    	{
    		doGet(request, response);
    	}
    	else if(request.getMethod().equalsIgnoreCase("POST"))
    	{
    		doPost(request, response);
    	}
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        response.getWriter().println("Request handled by doGet()");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        response.getWriter().println("Request handled by doPost()");
    }
}