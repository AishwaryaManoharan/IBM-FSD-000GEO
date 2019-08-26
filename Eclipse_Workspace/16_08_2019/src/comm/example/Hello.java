package comm.example;

public class Hello {
	public int age;
	public static void ages(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Vote denied");
		}
		else
		{
			System.out.println("Voted");
		}
	}
	
	public static void main(String[] args)
	{
		String a="Hello World ";
		
		char thisa=90;
		
		boolean boo=true;
		System.out.println(boo);
	
		System.out.println(thisa);
		System.out.println("Hello");
		
		//Wide casting
		int i=10;
		float z;
		z=10;
		System.out.println(i);
		System.out.println(z);
		
		//Narrow casting
		int it;
		float zt=5.7f;
		it=(int)zt;
		System.out.println(it);
		System.out.println(zt);
		
		System.out.println(a.length());
		System.out.println(a.toLowerCase());
		System.out.println(a.toUpperCase());
		System.out.println(a.indexOf("World"));
		
		String fname="Joe";
		String lname="Jonas";
		
		System.out.println(fname+" "+lname);
		System.out.println(fname.concat(lname));
		
	
		
		double s;
		s=Math.random();
		System.out.println(s);
		
		//Boolean expressions
		int one=1;
		float two=1f;
		System.out.println(one==two);
		
		
		//Short hand If.. Else 
		//Ternary operator
		
		int u=1;
		int v=5;
		System.out.println(u>v?"Hi":"Hello");
		
		int day=4;
		switch(day)
		{
		case 1:
			System.out.println("done");
		case 2 : 
			System.out.println("gone");
		
		}
		
		//for each
		String[] flowers= {"Rose","Lily","Jasmine"};
		for(String item:flowers)
		{
			System.out.println(item);
		}
		
		//Continue
		int index=0;
		while(index<10)
		{
			if(index==4)
			{
				index++;
				continue;
			}
			System.out.println(index);
			index++;
		}

		System.out.println(flowers.length);
		for(String si:flowers)
		{
			System.out.println(si);
		}
		
		for(int f=0;f<flowers.length;f++)
		{
			System.out.println(flowers[f]);
		}
		
		//Exceptions
		try
		{
			int[] array= {1,2,3,4};
			System.out.println(array[10]);
		}
		catch(Exception e)
		{
			System.out.println("Exception caught");
		}
		finally
		{
			System.out.println("Finally");
		}
		
		
		
		
		ages(10);
		
	}

}
