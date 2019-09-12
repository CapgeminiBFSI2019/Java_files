package mgait.listeners;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		ServletContext ctx = this.getServletContext();
		
		String admMail=(String) ctx.getAttribute("adMail");
		String configPath=(String) ctx.getAttribute("configPath");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		out.println("Admin email is : "+admMail);
		out.println("<br>Absolute path of config is : "+configPath);
		
		
		BufferedReader read = new BufferedReader(new FileReader(configPath));
		
		String line = read.readLine();
		out.println("<br>Content of the file config.txt : "+line);
		
		
	}

}
