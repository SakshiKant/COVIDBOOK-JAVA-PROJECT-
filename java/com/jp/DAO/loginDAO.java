package com.jp.DAO;

import com.jp.DB.DbConnection;
import com.univ.DTO.loginDTO;

import java.sql.*;


public class loginDAO {
	public   int checkLogin(loginDTO t1)
	{
		 int x=0;
		
		try {
			 Connection con1= DbConnection.getConn();
			 PreparedStatement ps= con1.prepareStatement("select * from reg_info where name=? and password=? and email=?  and status=?");
			 ps.setString(1,t1.getUsername());
			 ps.setString(2, t1.getPassword());
			 ps.setString(3, t1.getEmail());
			 ps.setString(4, t1.getStatus());
			 System.out.println(t1.getEmail());
			 System.out.println("ps value"+ps);
			 ResultSet rs= ps.executeQuery();
			 System.out.println(rs);
			 if(rs.next())
			 {
				 x=1;
				 
				 
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
