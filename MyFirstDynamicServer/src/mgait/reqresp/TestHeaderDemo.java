package mgait.reqresp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/header")
public class TestHeaderDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text/html"); // where to print the request
		PrintWriter out = response.getWriter();// use print writer object to print the data
		out.println("Testing Request and Response Object");
		
		out.println("<br>");
		String host = request.getHeader("Host");
		out.println("Host: "+host);
		
		out.println("<br>");
		String accept = request.getHeader("Accept");
		out.println("Accept values: "+accept);
		
		//ServletInputStream inputStream=request.getInputStream(); used to read a file or zip file uploaded in the web
		
		response.addHeader("MyHeader", "SomeValue");
		
		//response.setStatus(HttpServletResponse.SC_CREATED);//creates a new status code instead of 200 "OK"
		response.setStatus(202);
		
		out.println("<br>");
		out.println("Todays Date & Time: "+new Date());// this will show the date every 5 seconds in the web page
		response.setIntHeader("Refresh", 1);//Every 1 second the browser will refresh
		
		
		//send an error msg to the web page
		response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "user is not authorized to see the page");
		
		
		
		
	}

}
