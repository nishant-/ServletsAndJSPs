package com.nishant;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class CheckConnectionAction extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		
		ArrayList aList=getData(request);
	    HttpSession session = request.getSession();
	    session.setAttribute("allData", aList);
		 return mapping.findForward("success");
	
	}
	public  ArrayList getData(HttpServletRequest request)
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
	}

}
