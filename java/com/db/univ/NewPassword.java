package com.db.univ;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jp.DAO.*;
import com.univ.DTO.*;

/**
 * Servlet implementation class NewPassword
 */
public class NewPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewPassword() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String pwd1= request.getParameter("pass");
		String email= request.getParameter("gmail");
		
	ForgotPasswordDTO t1= new ForgotPasswordDTO(email,pwd1);
	ForgotPasswordDAO reg= new ForgotPasswordDAO();
	 int temp=reg.forgotPassword(t1);
	
	PrintWriter pw= response.getWriter();
	pw.println(temp+"Password updated");

	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
