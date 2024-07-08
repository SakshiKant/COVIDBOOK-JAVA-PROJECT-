package com.jp.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.jp.DB.*;
import com.univ.DTO.ForgotPasswordDTO;
import com.univ.DTO.*;

public class ForgotPasswordDAO {

	public int forgotPassword(ForgotPasswordDTO t1)
	{
		 int x=0;
		try {
			Connection con1= DbConnection.getConn();
			PreparedStatement ps= con1.prepareStatement("update reg_info set password=? where email=?");
			
			ps.setString(1, t1.getPassword());
			ps.setString(2, t1.getEmail1());
			System.out.println(ps);
			
			x=ps.executeUpdate();
		}
		catch(Exception ee)
	
		{
			System.out.println(ee);
		}
		return x;
	}
	

}


