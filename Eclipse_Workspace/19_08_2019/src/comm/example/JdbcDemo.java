
package comm.example;

import java.sql.Connection;
import java.util.Properties;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcDemo {
	private static Properties properties=null;
	
	static
	{
		properties=new Properties();
		//properties.("JDBC_URL","");
	}
	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
		//Connection connection=DriverManager.getConnection(properties.getProperty("JDBC_URL"),properties.);
		//Statement statement=connection.createStatement();
		//ResultSet resultSet=statement.executeQuery("select * from course");
	}

}
