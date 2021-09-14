package jdbc;

import java.sql.*;
class PrepareDemo
{
public static void main(String args[]) throws Exception
{

	String url="jdbc:mysql://localhost:3307/jdbc";
	String uname="root";
	String pass="root";
	//String query = "select name from student where sno=2";
//Class.forName("com.mysql.jdbc.Driver");

	Connection con= DriverManager.getConnection(url,uname,pass);
	
PreparedStatement pstmt=con.prepareStatement("insert into student values(?,?)");
pstmt.setInt(1,102);
pstmt.setString(2,"sandeep");


pstmt.executeUpdate();
System.out.println("one record is Inserted");

con.close();
}

}

