package com.nishant.customtag;
import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;
public class CustomTagClass extends TagSupport{
	
	String flag,value;
	@Override
	public int doStartTag() {
		// TODO Auto-generated method stub
		String flag=getFlag();
		String value=getValue();
		if(!Implementation.getString(flag).equals(value))
		{
			return SKIP_BODY;
		}
		else return EVAL_PAGE;
		
	}
	public void setFlag(String flag)
	{
		this.flag=flag;
	}
	public void setValue(String value)
	{
		this.value=value;
	}
	public String getFlag() {
		return flag;
	}
	public String getValue() {
		return value;
	}
	
	

}
