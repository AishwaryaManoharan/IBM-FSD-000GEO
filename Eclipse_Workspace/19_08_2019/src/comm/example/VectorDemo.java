package comm.example;

import java.util.List;
import java.util.Vector;
import java.util.Enumeration;

public class VectorDemo {
	
	private List<String> vector;
	
	public VectorDemo()
	{
		vector=new Vector<String>();
		vector.add("x");
		vector.add("y");
		vector.add("z");
		Enumeration<String> e=((Vector<String>) vector).elements();
		while(e.hasMoreElements())
			
		{
			System.out.println(e.nextElement());
		}
	}

}
