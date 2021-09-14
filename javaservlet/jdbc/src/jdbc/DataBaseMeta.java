package jdbc;

import java.sql.*;
class DataBaseMeta{
public static void main(String args[]) throws Exception{

	String url="jdbc:mysql://localhost:3307/jdbc";
	String uname="root";
	String pass="root";
	Connection con= DriverManager.getConnection(url,uname,pass);

DatabaseMetaData dbmd=con.getMetaData();

System.out.println("Driver Name: "+dbmd.getDriverName());
System.out.println("Driver Version: "+dbmd.getDriverVersion());
System.out.println("UserName: "+dbmd.getUserName());
System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());
System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());

con.close();

}


}

