package mgait.context;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/servlet1")
public class ServletOne extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletContext ctx = getServletConfig().getServletContext();
		
		String server=ctx.getServerInfo();
		String path =ctx.getContextPath();
		String abspath=ctx.getRealPath("/test.txt");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("Server info: "+server);
		
		out.println("<br>Server path: "+path);
		
		out.println("<br>Server absolute path: "+abspath);
		
		String adminEmail = ctx.getInitParameter("admin-email"); // gets from the context object in web.xml
		out.println("<br>Admin Email: "+adminEmail);
		
		ctx.setAttribute("test", "Test Value");
		
		
	}

}
