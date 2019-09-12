package mgait.sessions;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/one")
public class ServletOne extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String username=request.getParameter("userName");
		
		
		Cookie c1 = new Cookie("username", username);
		c1.setMaxAge(60);
		response.addCookie(c1);
		
		Cookie c2 = new Cookie("year", "2019");
		response.addCookie(c2);
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<a href='two'>Invoke Servlet Two</a>");
		
		
		
	}

}
