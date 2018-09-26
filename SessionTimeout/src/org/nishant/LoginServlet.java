package org.nishant;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = (HttpSession)request.getSession();
		session.setMaxInactiveInterval(30);
		String userName,password;
		userName = (String)request.getParameter("userName");
		password = (String)request.getParameter("password");
		UserBean userBean = new UserBean();
		if(userBean.authenticate(userName, password)){
			response.sendRedirect("welcome.jsp");
			return;
		}
		else
		{
			response.sendRedirect("Login.jsp");
			return;
		}
		
		
		
		
	}
	
	

}
