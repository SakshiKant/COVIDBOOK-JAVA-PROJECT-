package com.jp.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.jp.DB.DbConnection;
import com.univ.DTO.AppointmentDTO;
import com.univ.DTO.loginDTO;

public class AppointmentDAO {
	
		public   int appointment(AppointmentDTO d1)
		{
			 int x=0;
			
			try {
				 Connection con1= DbConnection.getConn();
				 PreparedStatement ps= con1.prepareStatement("select * from appointment where Dname=? and Speciality=? ");
				ResultSet rs= ps.executeQuery();
				while(rs.next())
				{
				 ps.setString(1,d1.getDName());
				 ps.setString(2, d1.getSpeciality());
				
				 ArrayList al= new  ArrayList();
				 al.add(ps);
				 System.out.println(al);
				 System.out.println(rs);
				 if(rs.next())
				 {
					 x=1;
					 
					 
				 }
			}
			}
			catch(Exception ee)
			{
				System.out.println(ee);
			}
			System.out.println("x value"+x);
			 return x;

		}

	}

}
