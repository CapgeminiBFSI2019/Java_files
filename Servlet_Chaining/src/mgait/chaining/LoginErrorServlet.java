package mgait.chaining;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/error")
public class LoginErrorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get the attribute from login servlet named message
		String message=(String) request.getAttribute("message");	
		
		//print the message
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		
		RequestDispatcher disp =request.getRequestDispatcher("Login.html"); // the root file name of Login html
		disp.include(request, response);//it will again include the login page and print the error message
		
		
		out.println("<h2 style='color:Red'>"+message+"</h2>");
		
		
		
		
		
		
		
		
	}

}
