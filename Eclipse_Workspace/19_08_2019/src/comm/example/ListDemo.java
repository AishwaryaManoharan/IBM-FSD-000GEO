package comm.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;


public class ListDemo {
	
	public static void main(String[] args)
	{
		Collection<String> list=new ArrayList<String>();
		int arr[];
		list.add("John");
		list.add("John");
		
		Set<String> set=new HashSet<String>();
		set.add("Hello");
		set.add("World");
		
		list.addAll(set);
		System.out.println(list);
		
		list.removeAll(set);
		System.out.println(list);
		
		list.clear();
		
		list.isEmpty();
		
		
		
		
		
		
		
		
		
		
	}

}
