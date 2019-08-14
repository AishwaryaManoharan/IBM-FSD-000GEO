package comm.example;

public class Modell {
	public void show1()
	{
		System.out.println("Outer class - Modell");
	}
	public class Square{
		public void show()
		{
			show1();
			System.out.println("Inner class - Square");
		}
	}
}
