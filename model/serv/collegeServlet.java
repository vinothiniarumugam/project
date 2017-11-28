package org.web.model.serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.web.model.Admin;
import org.web.model.ListOfCollege;
import org.web.model.service.adminService;
import org.web.model.service.collegeService;

/**
 * Servlet implementation class collegeServlet
 */
@WebServlet("/collegeServlet")
public class collegeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public collegeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try(PrintWriter out=response.getWriter())
		{
			String col=request.getParameter("ENTER THE COLLEGE NAME");
			if( col.isEmpty())
			{
					out.println("please! select the college");
					response.sendRedirect("welcome.html"));
			}
			else
			{
				ListOfCollege res = collegeService.getCollege(col);
				if(res == null || res1==null)
				{
					out.println("fill the valid details");	
					response.sendRedirect("admin.html");
				}
				else if(res.equals(admin) && res1.equals(pass))
				{
					out.print("logged successfully");
					
				}
			}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
