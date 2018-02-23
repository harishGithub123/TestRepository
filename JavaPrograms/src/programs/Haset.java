package programs;

import java.util.HashSet;
import java.util.Iterator;

public class Haset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs =new HashSet<String>();
		boolean b=hs.add("Harish");
		System.out.println(b);
		String a[]={"kumar","Harish","kalyan","pavan"};
		hs.add("1");
		hs.add("5");47d 
		hs.add("2");
		System.out.println(hs);
		for(int i=0;i<a.length;i++)
		{
			hs.add(a[i]);
		}
		if(hs.contains("pavan"))
		{
			System.out.println("Thank You");
		}
		System.out.println(hs.isEmpty()+" "+hs.size()+" "+hs.remove("Harish"));
		Iterator it=hs.iterator();
		System.out.println(hs.add("kalyan"));
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		hs.clear();
		System.out.println(hs.isEmpty());

	}

}
