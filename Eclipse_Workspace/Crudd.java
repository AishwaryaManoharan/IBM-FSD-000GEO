package comm.example;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


public class Crudd
{
	private static Properties properties = null;
	static 
	{
		properties = new Properties();
		properties.put("JDBC_URL", "jdbc:mysql://localhost:3306/aish");
		properties.put("USER", "root");
		properties.put("PASSWORD", "Aishwarya*17");
	}
	public Crudd() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Connection con = DriverManager.getConnection(properties.getProperty("JDBC_URL"), 
				properties.getProperty("USER"),
				properties.getProperty("PASSWORD"));
		System.out.println("Select one from below");
		System.out.println("1)Insert"+"\n"+"2)Update"+"\n"+"3)Delete"+"\n"+"4)Display"+"\n"+"5)Display using ID");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		
			switch(choice) 
			{
				case 1:
				{
					PreparedStatement ps = con.prepareStatement("insert into students values(?,?)");
					System.out.println("Enter Student's id");
					int id=sc.nextInt();
					System.out.println("Enter Student's Name");
					String name=sc.next();
					ps.setInt(1, id);
					ps.setString(2, name);
					int count=ps.executeUpdate();
					System.out.println(count+" rows inserted");
				}
				case 2:{
					System.out.println("Enter an ID to update");
					int id=sc.nextInt();
					System.out.println("Enter a name to update");
					String name=sc.next();
					PreparedStatement ps = con.prepareStatement("insert into students values(?) where eid=?");
					ps.setInt(1, id);
					ps.setString(2, name);
					int count=ps.executeUpdate();
					System.out.println(count+" rows updated");
				}
				case 3:
				{
					System.out.println("Enter an ID to delete");
					int id =sc.nextInt();
					PreparedStatement ps = con.prepareStatement("delete from students values(?) where eid=?");
					ps.setInt(1, id);
					ResultSet resultSet = ps.executeQuery();
					System.out.println("ID Name");
					while (resultSet.next()) {
						System.out.printf("\n%d %s", resultSet.getInt(1), resultSet.getString(2));
					System.out.println("Row deleted");
					
					}}
				case 4:{
					Statement statement = con.createStatement();
					ResultSet resultSet = statement.executeQuery("select * from students");
					System.out.println("ID Name");
					while (resultSet.next()) {
						System.out.printf("\n%d %s", resultSet.getInt(1), resultSet.getString(2));
					}
				}
				case 5:{
					System.out.println("Enter the Id of row you want to display");
					int id=sc.nextInt();
					PreparedStatement ps = con.prepareStatement("select * from students where eid=?");
					ps.setInt(1, id);
					ResultSet resultSet = ps.executeQuery();
					System.out.println("ID Name");
					while (resultSet.next()) {
						System.out.printf("\n%d %s", resultSet.getInt(1), resultSet.getString(2));
					}
				}
		}
	}
}
