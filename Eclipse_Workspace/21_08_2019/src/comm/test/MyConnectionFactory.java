package comm.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnectionFactory {
	private static Connection con;
	private static MyConnectionFactory factory=null;
	private MyConnectionFactory() throws SQLException{
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aish","root","Aishwarya*17");
	}
	public static MyConnectionFactory createObject() throws SQLException{
		if(factory==null) {
			factory=new MyConnectionFactory();
		}
		return factory;
	}
	public Connection getConnection()throws SQLException{
		return con;
	}
}