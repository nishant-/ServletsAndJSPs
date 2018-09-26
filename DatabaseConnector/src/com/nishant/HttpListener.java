package com.nishant;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * Application Lifecycle Listener implementation class HttpListener
 *
 */
public class HttpListener implements HttpSessionAttributeListener {

    /**
     * Default constructor. 
     */
    public HttpListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
     */
    public void attributeRemoved(HttpSessionBindingEvent arg0) {
        // TODO Auto-generated method stub
    	System.out.println("http session attribute removed: name="+arg0.getName().toString()+"value="+arg0.getValue());
    }

	/**
     * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
     */
    public void attributeAdded(HttpSessionBindingEvent arg0) {
        // TODO Auto-generated method stub
    	System.out.println("http session attribute added :name="+arg0.getName().toString()+"value="+arg0.getValue());
    }

	/**
     * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
     */
    public void attributeReplaced(HttpSessionBindingEvent arg0) {
        // TODO Auto-generated method stub
    }
	
}
