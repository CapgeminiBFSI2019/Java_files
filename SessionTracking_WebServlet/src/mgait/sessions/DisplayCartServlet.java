package mgait.sessions;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/displayCart")
public class DisplayCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession(false); // false is do not create a new session but add to an existing one
		
		//get the attribute of the session cart then add it to the cart here
		
		ArrayList<String>cart=(ArrayList<String>) session.getAttribute("MyCart");
		
		
		//response print it to an html file
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("Items in Cart : ");
		
		for(String prod:cart) {
			out.println("<br>"+prod);
		}
		
		session.invalidate(); //destroy the session after user clicks on diplay
		
	}

}
