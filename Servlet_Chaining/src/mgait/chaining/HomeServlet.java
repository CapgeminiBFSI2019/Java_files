package mgait.chaining;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//get attributes from loginservlet 
	String username=(String) request.getAttribute("user");	
	String message=(String) request.getAttribute("message");	
		
	
	response.setContentType("text/html");
	PrintWriter out =response.getWriter();
	
	out.println("<h3>Hello "+username+"</h3>");
	out.println("<br><h3>"+message+"</h3>");
	
	
	out.println("<br><h3>Welcome to our website</h3>");
	
	//use requestdispatcher to include the footerservlet
	
	RequestDispatcher dispatch = request.getRequestDispatcher("/FooterServlet");//use the footerservlet link
	
	dispatch.include(request, response);//include the request and the response
	
	
	out.println("<br><h3>Contact us @1800 900 818</h3>");
	
		
	}

}
