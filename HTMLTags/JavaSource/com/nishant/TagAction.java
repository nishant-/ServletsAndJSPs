package com.nishant;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class TagAction extends Action{
	
	 private final static String SUCCESS = "success";
	    
	    public ActionForward execute(ActionMapping mapping, ActionForm form,
	            HttpServletRequest request, HttpServletResponse response)
	            throws Exception {
	        if(form!=null)
	        {
	        	throw new Exception("Exception Occuurred");
	        }
	        return mapping.findForward(SUCCESS);

}
}