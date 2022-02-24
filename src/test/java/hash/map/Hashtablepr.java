package hash.map;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class Hashtablepr {

	public static void main(String[] args) {


		Hashtable h1 = new Hashtable();		
		h1.put(1, "rajat");
		h1.put(2, "naveen");
		h1.put(3, "cheen");
		//Hashtable h2 = new Hashtable();
		//h2=(Hashtable) h1.clone();
		//h1.clear();
		System.out.println(h1);
		//System.out.println(h2);
		// 1.by using enumeration 
		
		Enumeration e =h1.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());	
		}
		//2.by using sets
		Set s =h1.entrySet();
		System.out.println(s);
		//
		if(h1.containsKey(4)) {
			System.out.println("value is found");
		}
		else {
			System.out.println("value is not found");
	}

}}
