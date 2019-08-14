package comm.example.client;

public class ContractualEmployee extends Employee {
	private int rph;

	public ContractualEmployee()
	{
		super();
		System.out.println("Inside CEmployee default");
	}
	
	public ContractualEmployee(int rph)
	{
		super();
		System.out.println("Inside CEmployee para");
		this.rph=rph;
	}
	
	
	protected String getDetails()
	{
		return "rph"+rph;
	}
}
