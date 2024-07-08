package com.db.univ;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jp.DAO.AppointmentDAO;
import com.jp.DAO.loginDAO;
import com.univ.DTO.AppointmentDTO;
import com.univ.DTO.loginDTO;

/**
 * Servlet implementation class Appointment
 */
public class Appointment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Appointment() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		//RequestDispatcher dispatcher=null;
		
		String nm2= request.getParameter("Dname");
		String spec= request.getParameter("Speciality");
		
		AppointmentDTO d1= new AppointmentDTO(nm2, spec);
		AppointmentDAO t1= new AppointmentDAO();
		 int y=t1.appointment(d1);
		 System.out.println(y);
		 System.out.println(nm2);
		/* if(y!=0)
		 {
			session.setAttribute("name", nm2);
			response.sendRedirect("index.jsp");
			
			 
		 }
		 else
		 {
			 System.out.println("Fail");
			 response.sendRedirect("login.jsp");
		 }
		 */
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
