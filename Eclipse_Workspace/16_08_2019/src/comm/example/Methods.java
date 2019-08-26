package comm.example;

public class Methods {
	
	public static void add(int x,int y)
	{
		System.out.println(x+y);
	}
	
	public static void checkAge(int age)
	{
		if(age>18)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
	
	
	public static void main(String[] args)
	{
		add(3,4);
		checkAge(20);
	}

}
