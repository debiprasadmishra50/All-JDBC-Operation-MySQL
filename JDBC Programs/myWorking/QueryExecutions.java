package myWorking;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QueryExecutions 
{
	public static void main(String[] args) throws SQLException 
	{
		Connection con = Provider.getMysqlconnection();
		if(con != null)
			System.out.println("Connection Established\n");
		
		String sql = "Show Databases";
		PreparedStatement pst = con.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();
		while(rs.next())
			System.out.println(rs.getString(1));
		
		Statement st = con.createStatement();
		String sql1 = "Use coffee_store";
		boolean res = st.execute(sql1);
		System.out.println(res); //Returns false if Query is correct
		
		con.close();
	}
}
