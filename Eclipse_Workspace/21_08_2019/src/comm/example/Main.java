package comm.example;

//import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;
//import java.util.Collections;

public class Main {

	public static void main(String[] args)
	{
		int n;
		int id;
		String name;
		int choice;
//		List<Employee> el=new ArrayList<>();
////		Scanner sc=new Scanner(System.in);
////		System.out.println("Enter id");
////		sc.nextInt();
////		System.out.println("Enter name");
////		sc.next();
////		System.out.println("Enter department");
////		sc.next();
////		System.out.println("Enter date of joining");
////		sc.next();
////		System.out.println("Enter age");
////		sc.nextInt();
////		System.out.println("Enter salary");
////		sc.nextInt();
//		el.add(new Employee(1,"Aish","CSE",23,12000));
//		el.add(new Employee(3,"Sarika","IT",12,10));
//		el.add(new Employee(2,"Daisy","ECE",14,9800));
//		
//		Collections.sort(el,new Comparator<Employee>()
//		{
//		@Override
//		public int compare(Employee t,Employee t1)
//		{
//			if(t.age>t1.age)
//				return 1;
//			else if(t.age<t1.age)
//				return -1;
//			else
//				return 0;
//		}
//		});
//		
		System.out.println("Input the number of employees");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the details for employee");
			id=sc.nextInt();
			name=sc.next();
		}
		System.out.println("1.Sort employees by salary");
		System.out.println("2.Sort employees by age");
		System.out.println("Enter your choice");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			break;
		case 2:
			break;
		default:
			System.out.println("Enter 1 or 2");
			break;
		}
}
}
