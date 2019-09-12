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


@WebServlet("/cart")
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(); //creates a session for the users to keep login data/cart data
		
		//get the parameters from html addProduct.html
		
		String prodName=request.getParameter("prodName");
		
		//check for existing session
		
		ArrayList<String>cart=(ArrayList<String>) session.getAttribute("MyCart");
		
		//if above cart is null then create a new one earlier it used to create everytime a new arraylist
		if(cart==null) {
		cart = new ArrayList<String>();
		}
		
		
		cart.add(prodName);
		
		//add the cart to the existing session object
		
		session.setAttribute("MyCart", cart);
		
		//Response
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println(prodName+" has been added to your cart");
		
		
		String encodedURL=response.encodeUrl("addProducts.html");//use this when browser cookies are disabled
		
		//resend the link to addProducts html
		out.println("<br> <a href='"+encodedURL+"'>Add More Products</a>");
		
		//another link to display products in cart resend it to a new servlet called displayCart
		out.println("<br> <a href='displayCart'>Display Cart</a>");
		
		
		
		
		
		
		
	}

}
