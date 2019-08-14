package comm.example.client;

public class Account {
	private String bname;

	public Account()
	{
		System.out.println("Inside Account default");
	}
	
	public Account(String bname)
	{
		System.out.println("Inside Account para");
		this.bname=bname;
	}
	
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}

	
	

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}
	
	
	protected String getDetails()
	{
		return "name"+bname;
	}
}

