package comm.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class CrudOperations 
{
	private static Properties properties = null;
	static 
	{
		properties = new Properties();
		properties.put("JDBC_URL", "jdbc:mysql://localhost:3306/aish");
		properties.put("USER", "root");
		properties.put("PASSWORD", "Aishwarya*17");
	}
	public CrudOperations() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = DriverManager.getConnection(properties.getProperty("JDBC_URL"), properties.getProperty("USER"),
				properties.getProperty("PASSWORD"));
		System.out.println("These are thhe options available,Please select one from them");
		System.out.println("1)Insert"+"\n"+"2)Update"+"\n"+"3)Delete"+"\n"+"4)Display"+"\n"+"5)Dispaly By Specific Id");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		while(choice<=5 && choice>0) {
			switch(choice) {
				case 1:
				{
					PreparedStatement ps = con.prepareStatement("insert into proj values(?,?)");
					System.out.println("Enter Project id");
					int id=sc.nextInt();
					System.out.println("Enter Project Name");
					String name=sc.next();
					ps.setInt(1, id);
					ps.setString(2, name);
					int count=ps.executeUpdate();
					System.out.println(count+" rows inserted");
				}
				case 2:{
					System.out.println("Enter the id of the project you want to update");
					int id=sc.nextInt();
					System.out.println("Please Enter the updated name of the project you want to update");
					String name=sc.next();
					PreparedStatement ps = con.prepareStatement("insert into proj values(?) where pid=?");
					ps.setInt(1, id);
					ps.setString(2, name);
					int count=ps.executeUpdate();
					System.out.println(count+" rows updated");
				}
				case 3:
				{
					System.out.println("Enter the id of the project you want to delete");
					int id =sc.nextInt();
					PreparedStatement ps = con.prepareStatement("delete from proj values(?) where pid=?");
					ps.setInt(1, id);
					//ps.setString (2,name);
;					int count=ps.executeUpdate();
					System.out.println(count+" rows updated");
					
					
				}
				case 4:{
					Statement statement = con.createStatement();
					ResultSet resultSet = statement.executeQuery("select * from proj");
					System.out.println("ID Name");
					while (resultSet.next()) {
						System.out.printf("\n%d %s", resultSet.getInt(1), resultSet.getString(2));
					}
				}
				case 5:{
					System.out.println("Enter the Id of row you want to display");
					int id=sc.nextInt();
					PreparedStatement ps = con.prepareStatement("select * from proj where pid=?");
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
}

