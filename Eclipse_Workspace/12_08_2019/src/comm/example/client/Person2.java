package comm.example.client;

public class Person2 extends Account{
	private int salary2;

	public Person2()
	{
		super();
		System.out.println("Inside default");
	}
	
	public Person2(int salary2)
	{
		super();
		System.out.println("Inside para");
		this.salary2=salary2;
	}
	

	protected String getDetails()
	{
		return "salary2"+salary2;
	}
}

