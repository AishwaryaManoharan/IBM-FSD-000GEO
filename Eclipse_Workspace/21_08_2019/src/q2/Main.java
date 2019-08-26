package q2;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		UserMainCode u=new UserMainCode();
		System.out.println("Enter password for validation");
		String input=s.next();
		if(UserMainCode.checkPassword(input))
		{
			System.out.println("Password valid");
		}
		else
		{
			System.out.println("Password invalid");
		}
	}

}
