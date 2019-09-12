package mgait.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

//to make a java class to filter implement filter
public class LogFilter implements Filter{

	private FilterConfig config;
	@Override
	public void init(FilterConfig filterConfig)
			throws ServletException {
		
		this.config=filterConfig;
		
	}
	
	
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		//do some functions like config, getting filter name etc
		ServletContext context=config.getServletContext(); // log the config object
		
		String filterName= config.getFilterName();
		
		HttpServletRequest httpreq = (HttpServletRequest) request;
		
		context.log(filterName+" intercepting the request for path "+httpreq.getRequestURI());
		
		chain.doFilter(request, response);//whatever written above it executes before the servlet and below after the servlet
		
		context.log(filterName+" intercepting the response for path "+httpreq.getRequestURI());
		
	}

	
	@Override
	public void destroy(){
		config = null;
		
	}
	
	
	
}
