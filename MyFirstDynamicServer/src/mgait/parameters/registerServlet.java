package mgait.parameters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/register")
public class registerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String custName=request.getParameter("custName");
		String gender=request.getParameter("gender");
		//String interests=request.getParameter("interests");
		String[] interests=request.getParameterValues("interests");//fetching multiple parameters
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		out.println("<h3>Registration Details</h3>");
		out.println("<h2>Name: "+custName+"</h2>");
		out.println("<h2>Gender: "+gender+"</h2>");
		out.println("<h2>Interests: </h2>");
		for(String catg:interests) {
			out.println(catg);
		}
		
	}

}
