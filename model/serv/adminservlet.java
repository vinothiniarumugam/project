package org.web.model.serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.web.model.Admin;
import org.web.model.service.adminService;

/**
 * Servlet implementation class adminservlet
 */
@WebServlet("/adminservlet")
public class adminservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adminservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try(PrintWriter out=response.getWriter())
		{
			String admin=request.getParameter("adminname");
			String pass=request.getParameter("password");
			out.println("hai");
			if( admin.isEmpty() || pass.isEmpty())
			{
					out.println("fill the required details");	
			}
			else
			{
				Admin res = adminService.getAdminName(admin);
				Admin res1 = adminService.getPass(pass);
				
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
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
