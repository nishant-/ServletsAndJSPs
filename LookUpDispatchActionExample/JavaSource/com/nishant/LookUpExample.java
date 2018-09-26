package com.nishant;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.LookupDispatchAction;

public class LookUpExample extends LookupDispatchAction {

	@Override
	protected Map getKeyMethodMap() {
		Map map = new HashMap();
		map.put("button.add", "add");
		map.put("button.delete", "delete");
		return map;
	}
	
	
	public ActionForward add(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse response) throws Exception
	{
		return mapping.findForward("add");
	}
	public ActionForward delete(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse response) throws Exception
	{
		return mapping.findForward("delete");
	}

	

}
