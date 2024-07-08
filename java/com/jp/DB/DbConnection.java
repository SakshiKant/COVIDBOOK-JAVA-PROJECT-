package com.jp.DB;
import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection implements DBConfig {

	public static Connection getConn()
	{
		Connection con= null;
		try {
			Class.forName(Driver);
			con= DriverManager.getConnection(Conn,unm,pw);
			System.out.println("Connectoion established");
		}
		catch(Exception  ee)
		{
			System.out.println(ee);
		}
		return con;
	}
}
