package myWorking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Provider 
{
	public static Connection getMysqlconnection()
	{
		Connection con = null;
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "student", "sipusipu18");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return con;
	}
	public static void main(String[] args) throws SQLException 
	{
		Connection con = Provider.getMysqlconnection();
		System.out.println(con);
		
		if(con != null)
		{
			System.out.println("Connection Established With MySql Database");
			
			System.out.println("Do Operation Here");
			
			System.out.println("Connection Close");
			con.close();
		}
		else
			System.out.println("Connection Failure");
	}
}
