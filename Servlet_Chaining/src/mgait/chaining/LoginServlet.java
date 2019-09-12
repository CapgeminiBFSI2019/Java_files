package mgait.chaining;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//get the parameter from login html page
		String username= request.getParameter("username");
		String password= request.getParameter("password");
		
		//validate the credentials
		if(username.equals("admin")&& password.equals("pass")){
			// On correct validation forward to home servlet
			request.setAttribute("user", username);
			request.setAttribute("message", "You have logged in succesfully");
			RequestDispatcher dis=request.getRequestDispatcher("/HomeServlet");//link of homeservlet
			dis.forward(request, response);//forward it to home servlet
		}else {
			//On invalidation forward it to loginError servlet
			request.setAttribute("message", "Invalid Login Credentials - try again !!");
			RequestDispatcher dis1=request.getRequestDispatcher("/error");//link of errorservlet
			dis1.forward(request, response);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
