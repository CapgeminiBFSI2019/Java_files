package mgait.listeners;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyAppInitializer implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("Web Application Stopped");
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("Web Application Started");
		
		ServletContext s=sce.getServletContext();
		String adEmail = s.getInitParameter("admin-email");
		s.setAttribute("adMail", adEmail);
		
		
		String configPath=s.getRealPath("config.txt"); 
		
		s.setAttribute("configPath", configPath);
		
		
		
	}
	
	
	
	
	
	
	
	

}
