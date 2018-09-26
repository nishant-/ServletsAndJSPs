package com.nishant;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;

public class DynaFormActionClass extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		DynaActionForm loginForm = (DynaActionForm)form;
		loginForm.validate(mapping, request);
		String userName=loginForm.get("userName").toString();
		String age=loginForm.get("age").toString();
		return mapping.findForward("success");
	}
	
	

}


