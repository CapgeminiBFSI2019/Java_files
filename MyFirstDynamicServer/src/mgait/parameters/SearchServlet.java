package mgait.parameters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/search")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String empName=request.getParameter("empName");
		String gender=request.getParameter("gender");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("Name of the employee : "+empName);
		out.println("Gender of the employee : "+gender);
	}

}
