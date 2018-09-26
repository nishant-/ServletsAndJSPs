package org.nishant;

public class UserBean {

	String userName;
	String password;
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
	
	public boolean authenticate(String userName,String password)
	{
		if(userName==null || userName=="")
			return false;
		return true;
	}
	
}
