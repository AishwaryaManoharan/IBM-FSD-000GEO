package comm.example;

public class AgeComparator {
		
		public int compare(Employee a,Employee b)
		{
			if (a.age==b.age)
				return 0;
			else if(a.age>b.age)
				return 1;
			else
				return -1;
		}
		
	
}
