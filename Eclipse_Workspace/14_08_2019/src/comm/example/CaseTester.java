package comm.example;

public class CaseTester {

	public static void main(String args[])
	
	{
		try {
		UpperCase u=new UpperCase();
		u.check("Aishwarya","manoharan");
		}
		catch(MyException e) {
			System.out.println(e.getMessage());
		}
	}	
			
}
