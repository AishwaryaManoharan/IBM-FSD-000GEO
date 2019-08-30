package comm.maven.crud;


import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.Scanner;



public class Tester {

	public static void main(String[] args)
	{
		try
		{
			SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
			System.out.println("Enter your choice");
			Scanner sc=new Scanner(System.in);
			
			
			System.out.println("1.Insert\n2.Display\n3.Delete\n4.Update\n5.Exit");
			int choice = sc.nextInt();
			
			Session session=factory.openSession();
			
			switch(choice)
			{
			case 1:
				
				Employee employee=new Employee("Dia","Mirza","mirza@gg.com");
				session.getTransaction().begin();
				//session.save(employee);
				session.persist(employee);
				System.out.println("Inserted");
				session.getTransaction().commit();
				break;
				
			case 2:
				Query query=session.createQuery("from Employee");
				 @SuppressWarnings("unchecked")
				List<Employee> list=query.getResultList();
				 
				 for(Employee e:list)
				 {
					 System.out.println(e);
				 }
				 break;
			case 3:
				System.out.println("Performing deletion");
				int id=5;
				System.out.println("Getting the student with the id "+id);
				Employee emp=session.get(Employee.class,id);
				System.out.println("Deleting this row/object"+id);
				session.delete(emp);
				System.out.println("Deleted successfully...\nCheck db for further details");
				break;
			case 4:
				session.beginTransaction();
				System.out.println("Performing updation");
				int uid=2;
				Employee empl=session.get(Employee.class, uid);
				empl.setFirstname("Queency");
				empl.setLastname("Sawyer");
				empl.setEmail("qs@gg.com");
				session.merge(empl);
				session.getTransaction().commit();
		}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
