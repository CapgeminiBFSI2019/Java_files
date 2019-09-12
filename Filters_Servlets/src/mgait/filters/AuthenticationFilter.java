package mgait.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebFilter(filterName="authenticate")
public class AuthenticationFilter implements Filter {


	private FilterConfig config;
 
	public void destroy() {
		config=null;
		
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		//convert servlet req, resp to http req,resp
		HttpServletRequest httpreq=(HttpServletRequest) request;
		HttpServletResponse httpresp=(HttpServletResponse) response;
		
		HttpSession session = httpreq.getSession();
		
		if(session.getAttribute("user")==null) {//this means the authentication is done
			//then redirect it to the login page
			httpresp.sendRedirect("login.html");
		}
		
		
		chain.doFilter(request, response);
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		this.config=fConfig;
		
	}

}
