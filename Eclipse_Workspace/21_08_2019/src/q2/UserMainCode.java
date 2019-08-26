package q2;
import java.lang.*;

public class UserMainCode {
	
	public static boolean checkPassword(String pwd)
	{
		int i;
		int upper=0;
		int lower=0;
		int digit=0;
		
		if(pwd.length()<8)
		{
			return false;
		}
		
		for(i=0;i<pwd.length();i++)
		{
			char ch=pwd.charAt(i);
			if(Character.isLowerCase(ch))
				lower++;
			if(Character.isDigit(ch))
				digit++;
			if(Character.isUpperCase(ch))
				upper++;
		}
		if(lower>0&&upper>0&&digit>0)
		{
			return true;
		}
		return false;
	}

}
