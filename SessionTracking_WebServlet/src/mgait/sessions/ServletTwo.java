package mgait.sessions;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/two")
public class ServletTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Cookie[] cookies = request.getCookies();
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		for(Cookie c:cookies) {
			out.println("<br>Cookie name : "+c.getName());
			out.println("Cookie value : "+c.getValue());
			
		}
		
		
		
		
		
	}

}
