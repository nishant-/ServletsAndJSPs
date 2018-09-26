package com.nishant;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.Action;

public class BuildData extends Action{
	
	/*public  ArrayList getData(HttpServletRequest request)
	{
		javax.sql.DataSource dataSource;
		java.sql.Connection connection;
		ArrayList aList=new ArrayList();
		try
		{
			
			dataSource = getDataSource(request,"ods");
			connection=dataSource.getConnection();
			String sqlStmt="select REGION_ID , REGION_NAME FROM REGIONS";
			PreparedStatement pstmt =connection.prepareStatement(sqlStmt);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
			{
				aList.add(new Region(rs.getInt(1),rs.getString(2)));
				
			}
		}
		catch(Exception e){
			
		}
		return aList;
	}*/

}
