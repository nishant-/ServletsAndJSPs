package com.nishant;

import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

public class CheckForm extends ActionForm{

	Integer regionID;
	String regionName;
	
	public Integer getUserName() {
		return regionID;
	}
	public void setUserName(Integer regionId) {
		this.regionID = regionId;
	}
	public String getUserEmail() {
		return regionName;
	}
	public void setUserEmail(String regionName) {
		this.regionName = regionName;
	}
	
	}
	
