package comm.example;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.Properties;
	import java.util.Scanner;

	public class CRUD {
		private static Properties properties = null;
		static {
			properties = new Properties();
			properties.put("JDBC_URL", "jdbc:mysql://localhost:3306/aish");
			properties.put("USER", "root");
			properties.put("PASSWORD", "Aishwarya*17");
		}
		public CRUD() {
			super();
			// TODO Auto-generated constructor stub
		}
		public static void main(String[] args) throws ClassNotFoundException, SQLException 
		{
			Connection con = DriverManager.getConnection(properties.getProperty("JDBC_URL"), properties.getProperty("USER"),
					properties.getProperty("PASSWORD"));
			System.out.println("SELECT OPTION FROM BELOW");
			System.out.println("1)Insert"+"\n"+"2)Update"+"\n"+"3)Delete"+"\n"+"4)Display"+"\n"+"5)Display By ID");
			Scanner sc=new Scanner(System.in);
			int choice=sc.nextInt();
		
				switch(choice)
				{
					case 1:
					{
						PreparedStatement ps = con.prepareStatement("Insert values(?,?)");
						System.out.println("Enter Student id");
						int id=sc.nextInt();
						System.out.println("Enter Student's Name");
						String ename=sc.next();
						ps.setInt(1, id);
						ps.setString(2, ename);
						int count=ps.executeUpdate();
						System.out.println(count+" rows inserted");
					}
					case 2:{
						System.out.println("Enter the id of the student you want to update");
						int id=sc.nextInt();
						System.out.println("Please enter change of name");
						String ename=sc.next();
						PreparedStatement ps = con.prepareStatement("insert into student values(?) where id=?");
						ps.setInt(1, id);
						ps.setString(2, ename);
						int count=ps.executeUpdate();
						System.out.println(count+" rows updated");
					}
					case 3:{
						
					}
					case 4:{
						Statement statement = con.createStatement();
						ResultSet resultSet = statement.executeQuery("select * from student");
						System.out.println("ID Name");
						while (resultSet.next()) {
							System.out.printf("\n%d %s", resultSet.getInt(1), resultSet.getString(2));
						}
					}
					case 5:{
						System.out.println("Enter the Id of row you want to display");
						int id=sc.nextInt();
						PreparedStatement ps = con.prepareStatement("select * from student where id=?");
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

