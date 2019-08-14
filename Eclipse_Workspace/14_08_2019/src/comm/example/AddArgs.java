package comm.example;

public class AddArgs 
{

	public static void main(String[] args)
	{
	
	int sum=0;
	for(String a:args)
	{
		try {
			System.out.println(args[10]);
		sum+=Integer.parseInt(a);//Line below execution never executes
		
		}
		catch(NumberFormatException nfe)
		{
			//System.out.println("Number Format");
			//System.out.println(nfe.getCause().toString());
			System.err.println(nfe.getMessage());
			//nfe.printStackTrace
			System.exit(0);
		}
		catch(ArrayIndexOutOfBoundsException aeobe)
		{
			System.out.println("Array index out of bound ");
		}
		catch(Exception e)
		{
			System.out.println("Exception occured");
			System.out.println();
		}
		finally
		{
			System.out.println("Finally");
		}
	}
	System.out.println("Sum="+sum);
	}
}
