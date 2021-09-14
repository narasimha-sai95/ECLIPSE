package jdbc;

import java.sql.*;

public class Democlass {

	public static void main(String[] args) throws Exception {
	
		String url="jdbc:mysql://localhost:3307/jdbc";
		String uname="root";
		String pass="root";
		String query = "select name from student where sno=2";
	//Class.forName("com.mysql.jdbc.Driver");
	
		Connection con= DriverManager.getConnection(url,uname,pass);
		
		
		Statement st=con.createStatement();
		
		ResultSet rs=st.executeQuery(query);
		rs.next();
		
		String name=rs.getString("name");
		
		System.out.print(name);
		
		st.close();
		con.close();
		
		
		
		
	}

}
