package myWorking;
import java.sql.*;

public class ResultSetDemo 
{	
	public static void main(String[] args) throws SQLException 
	{
		Connection con = Provider.getMysqlconnection();
//		System.out.println(con);
		if(con != null)
			System.out.println("Connection Established");
		
		String sql = "Select * from employees";
		PreparedStatement pst = con.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();
		while(rs.next())
			System.out.println(rs.getRow()+" -> "+rs.getString("last_name") + ", " + rs.getString("first_name")+", "+rs.getString("email"));
		
		con.close();
	}
}
