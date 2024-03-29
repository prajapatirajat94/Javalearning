package hash.map;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Practice {

	public static void main(String[] args) {
		HashMap<Integer, String> h1 = new HashMap<Integer,String>();
		
		h1.put(1, "rajat");
		h1.put(2, "kamal");
		h1.put(3, "kajol");
		h1.put(4, "naveen");
		h1.put(5, "cheena");
		h1.put(6, "rancho");
		 
		
		Iterator<Integer>i =h1.keySet().iterator();
		
		while(i.hasNext()) {
			Integer key = i.next();
			String value= h1.get(key);
			System.out.println("key is "+key+ "value is "+value);
		}
		
		h1.forEach((k,v)->System.out.println("key is "+k+ "value is "+v));

	}

}
