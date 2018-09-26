package com.nishant;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorForm;

public class LoginForm extends ValidatorForm {

	private String userName;
	private String password;
	public void reset(ActionMapping mapping, HttpServletRequest request)
	{
	password = "";
	userName = "";
	}
	public String getPassword() {
	return password;
	}
	public String getUserName() {
	return userName;
	}
	public void setPassword(String string) {
	password = string;
	}
	public void setUserName(String string) {
	userName = string;
	}
	}
	
