package hash.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmappr {

public static void main(String[] args) {	
	
	
	HashMap<Integer, String> h1 = new HashMap<Integer,String>();
	
	h1.put(1, "rajat");
	h1.put(2, "kamal");
	h1.put(3, "kajol");
	h1.put(4, "naveen");
	h1.put(5, "rajat");
	h1.put(6, "rancho");
	// By using entry set
	
	Iterator<Entry<Integer, String>>it = h1.entrySet().iterator();
	while(it.hasNext()) {
		Entry<Integer,String> e =it.next();
		System.out.println(e.getKey()+" and "+e.getValue());
	}
	System.out.println("---------------------------------------");
	//By using Key set 
	Iterator<Integer>it1=h1.keySet().iterator();
	while(it1.hasNext()) {
		Integer key = it1.next();
		String value = h1.get(key);
		System.out.println(key+"key "+ value+" value");
	}
	System.out.println("-------------------------------------------");
	//using lambda
	h1.forEach((k,v)->System.out.println(k+" and "+v));
	}
	}

