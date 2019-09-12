package mgait.sessionlistener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


@WebListener
public class MyAppSessionCounter implements HttpSessionListener {

    private static int activeSessions=0;	//only static methods can be initialized
    public void sessionCreated(HttpSessionEvent se)  { 
         activeSessions++;
    }

	
    public void sessionDestroyed(HttpSessionEvent se)  { 
         activeSessions--;
    }


	public static int getActiveSessions() {//static to call this method without creating an object
		return activeSessions;
	}
	
    
    
    
    
}
