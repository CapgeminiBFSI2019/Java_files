package mgait.chaining;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/search")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String searchItem=request.getParameter("searchItem");
		
		response.sendRedirect("http://www.google.co.in/#q="+searchItem); //this is redirection to another website
		//google query parameter as searchitem
		
		
		
		
		
	}

}
