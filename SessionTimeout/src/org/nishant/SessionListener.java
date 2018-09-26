package org.nishant;

import java.io.Serializable;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class SessionListener
 *
 */
public class SessionListener implements HttpSessionListener,Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	private static Integer sessionCount=0;
	/**
     * Default constructor. 
     */
	
	
	
    public SessionListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent se) {
        
    	System.out.println("Session created at : " + new java.util.Date().getTime());
    	
    	sessionCount++;
    	
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent se) {
        
    	System.out.println("Session destroyed at : " + new java.util.Date().getTime());
    	
    	
    	
    }
    
    public static int getSessionCount()
    {
    	return sessionCount;
    }
	
}
