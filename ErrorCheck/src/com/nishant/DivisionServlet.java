package com.nishant;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DivisionServlet
 */
public class DivisionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DivisionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session  =  (HttpSession)request.getSession();
		String firstNum = (String)request.getParameter("firstNum");
		String secondNum = (String)request.getParameter("secondNum");
		int num1 = Integer.parseInt(firstNum);
		int num2 = Integer.parseInt(secondNum);
		int result = 0;
		try
		{
			result = num1/num2;
		}
		catch(ArithmeticException ae)
		{
			response.sendRedirect("error.jsp");
			return;
		}
		session.setAttribute("result", ""+result+"");
		response.sendRedirect("result.jsp");
		return;
		
		
	}

}
