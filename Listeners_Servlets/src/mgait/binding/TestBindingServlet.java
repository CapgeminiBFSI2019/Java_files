package mgait.binding;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/binding")
public class TestBindingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// binding is done to know how many users are actively logged in or logged out recently
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		HttpSession session=request.getSession(); //create a session object
		
		//bind the session
		
		
		User user = new User("Avisek");
		session.setAttribute("user1", user);// this set attributes helps in session binding remember it
		session.setAttribute("user2", new User("Gugul"));
		request.setAttribute("user3", new User("Sunil"));//this will not run as binding runs only on session
		
		session.removeAttribute("user1");
		
	}

}
