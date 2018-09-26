package com.nishant;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ConnectionServlet
 */
public class ConnectionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConnectionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*ServletContext sc = getServletContext();
		String st=sc.getServerInfo();
		String st1=sc.getContextPath();
		String[]val = new String[3];
		String uid = new java.rmi.server.UID().toString();
		Cookie c = new Cookie("sessionid",uid);
		response.addCookie(c);
		Enumeration e=sc.getInitParameterNames();
		int i=0;
		while(e.hasMoreElements())
		{
			val[i]=e.nextElement().toString();
			i++;
		}
		String fromFilter = request.getAttribute("key").toString();*/
		ServletConfig scon = getServletConfig();
		String param1=scon.getInitParameter("driverclassname");
		String param2=scon.getInitParameter("url");
		request.setAttribute("k1", "v1");
		HttpSession session = null;
		session = request.getSession();
		session.setAttribute("s1", "sval");
		session.removeAttribute("s1");
		Enumeration e1 = request.getHeaderNames();String header="",headerInfo="",info="";
		while(e1.hasMoreElements())
		{
			header=e1.nextElement().toString();
			headerInfo=request.getHeader(header);
			//if(headerInfo.equals("*/*"))
				//continue;
			//info=info+header+"="+headerInfo+"\n\n";
		}
		PrintWriter pw = response.getWriter();
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<body>");
		pw.println("Hello Servlet");
		pw.println("<br>");
	/*	pw.println("Servlet Info "+st);
		pw.println("<br>");
		pw.println("Context Path "+st1);
		pw.println("<br>");
		pw.println("Val1:"+val[0]);
		pw.println("<br>");
		pw.println("Val2:"+val[1]);*/
		pw.println("<br>");
		pw.println("param1:"+param1);
		pw.println("<br>");
		pw.println("param2:"+param2);
		pw.println("<br>");
		pw.println(request.getCookies()[0]);
		pw.println("<br>");
		//pw.println("from filter:"+fromFilter);
		pw.println("<br>");
		pw.println(info);
		pw.println("</body>");
		pw.println("</head>");
		pw.println("</html>");
		
		pw.flush();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
