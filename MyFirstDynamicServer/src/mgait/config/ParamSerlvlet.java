package mgait.config;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ParamSerlvlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	   ServletConfig config = this.getServletConfig();
	   
	   String sname=config.getServletName();
	   
	   //Print it on a html website
	   
	   
	   resp.setContentType("text/html"); // print the content as text on a html file
	   PrintWriter out = resp.getWriter(); //use the printwriter to do so
	   
	   out.println("Servlet name: "+sname);
	   
	   
		
	}
	
	
	
	
	
	

}
