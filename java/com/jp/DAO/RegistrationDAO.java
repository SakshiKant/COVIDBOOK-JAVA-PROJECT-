package com.jp.DAO;

import com.jp.DB.DbConnection;
import com.univ.DTO.RegistrtionDTO;

import java.sql.*;

public class RegistrationDAO {
	public int insertRegistration(RegistrtionDTO t1)
	{
		 int x=0;
		try {
			Connection con1= DbConnection.getConn();
			PreparedStatement ps= con1.prepareStatement("insert into reg_info(name,password,mob,email,address) values(?,?,?,?,?)");
			ps.setString(1, t1.getUserName());
			ps.setString(2, t1.getPassword());
			ps.setInt(3, t1.getMob());
			ps.setString(4,t1.getEmail());
			ps.setString(5, t1.getAddress());
			x=ps.executeUpdate();
		}
		catch(Exception ee)
	
		{
			System.out.println(ee);
		}
		return x;
	}
	

}
