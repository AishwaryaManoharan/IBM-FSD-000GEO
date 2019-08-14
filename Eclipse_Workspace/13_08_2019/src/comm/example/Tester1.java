package comm.example;

public class Tester1 {
	
	public static void main()
	{
	
	Model m=new Line(0,10);
	Model m1=new Line(10,20); 
	
	System.out.println(m.isGreater(m,m1));
	}

}
