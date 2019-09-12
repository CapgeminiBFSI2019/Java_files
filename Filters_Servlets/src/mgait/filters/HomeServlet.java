package mgait.filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/home")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		ServletContext ctx = getServletContext();
		ctx.log("Home Servlet Executed");
		
		out.println("<h2>Welcome to my web servlet</h2>");
		
		out.println("<a href='secure'>Invoke secure servlet</a>");
			
	}

  // invoke the post method to do login authentication
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		
		if(username.equals("Avisek") && password.equals("123")) {
			HttpSession session = req.getSession();
			session.setAttribute("user", username);
			
			resp.sendRedirect("home");//this methods sends the login post again to this servlet so that do get method is executed
				
		}else {
			resp.sendRedirect("login.html"); // if invalid user then redirect it to login.html again
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
