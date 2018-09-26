package com.nishant;

import org.apache.struts.action.ActionForm;

public class RegistrationForm extends ActionForm{

	String teamName;
	String captainName;
	String name1,name2,name3;
	String email;
	String zoneRating;
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getCaptainName() {
		return captainName;
	}
	public void setCaptainName(String captainName) {
		this.captainName = captainName;
	}
	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	public String getName2() {
		return name2;
	}
	public void setName2(String name2) {
		this.name2 = name2;
	}
	public String getName3() {
		return name3;
	}
	public void setName3(String name3) {
		this.name3 = name3;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getZoneRating() {
		return zoneRating;
	}
	public void setZoneRating(String zoneRating) {
		this.zoneRating = zoneRating;
	}
	
}
