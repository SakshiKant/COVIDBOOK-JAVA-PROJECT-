  package com.db.univ;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jp.DAO.RegistrationDAO;
import com.univ.DTO.RegistrtionDTO;

/**
 * Servlet implementation class Inregistration
 */
public class Inregistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Inregistration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String nm1=request.getParameter("name");
		String pwd1= request.getParameter("password");
		String email= request.getParameter("Email");
		String address= request.getParameter("address");
	int mob1= Integer.parseInt(request.getParameter("Phone Number"));
	
	RegistrtionDTO t1= new RegistrtionDTO(nm1,pwd1,email,address,mob1,1,0);
	RegistrationDAO reg= new RegistrationDAO();
	int temp=reg.insertRegistration(t1);
	
	PrintWriter pw= response.getWriter();
	pw.println(temp+"Data is Inserted");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
