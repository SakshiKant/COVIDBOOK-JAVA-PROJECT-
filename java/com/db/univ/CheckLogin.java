package com.db.univ;
 import com.univ.DTO.*;
  import com.jp.DAO.*;
 

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CheckLogin
 */
public class CheckLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckLogin() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		RequestDispatcher dispatcher=null;
		
		String nm2= request.getParameter("name");
		String pwd1= request.getParameter("password");
		String email1= request.getParameter("Email");
		String status=request.getParameter("select");
		System.out.println(status);
		System.out.println( "Email"+email1);
		loginDTO d1= new loginDTO(nm2,pwd1,email1,status);
		loginDAO t1= new loginDAO();
		 int y=t1.checkLogin(d1);
		 System.out.println(y);
		 System.out.println(nm2);
		 if(y!=0)
		 {
			 session.setAttribute("name", nm2);
			 System.out.println("Sesion Estahblished");
			  if(status=="0")
			  {
			
			response.sendRedirect("index.jsp");
			  }
			  else 
			  {
				  System.out.println(status);
				  
					response.sendRedirect("admin.jsp");
				  
			  }
			 
		 }
		 else
		 {
   
			 System.out.println("Fail");
			 response.sendRedirect("login.jsp");
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
