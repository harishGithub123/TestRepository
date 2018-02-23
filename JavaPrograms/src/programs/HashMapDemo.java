package programs;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> hm=new HashMap<>();
		hm.put("Harish", 20);
		hm.put("Kumar", 25);
		hm.put("Sachin", 30);
		hm.put("Kumar", 35);
		hm.put("Sachin", 55);
		hm.put("", 75);
	
		System.out.println(hm.keySet());
		System.out.println(hm.get("Harish"));
		Set<String> set=new HashSet<String>();
		set=hm.keySet();
		System.out.println(set);
		hm.put("dravid", 50);
		System.out.println(hm.remove("dravid"));
		Collection<Integer> a=hm.values();
		System.out.println(a);
		
		

	}

}
