package mgait.binding;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class User implements HttpSessionBindingListener {//this will notify when a user is logged in or logged out of the session
	

	private String userName;
	
	public User() {
	
	}

	@Override
	public void valueBound(HttpSessionBindingEvent event) {
		
		User user = (User) event.getValue();
		System.out.println("User with username: "+user.getUserName()+" bound to the session");
		
	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
		User user = (User) event.getValue();
		System.out.println("User with username: "+user.getUserName()+" unbound from the session");
		
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public User(String userName) {
		this.userName = userName;
	}

	
	
	
	
	
	
}
