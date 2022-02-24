package setpr;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Setpr {

	public static void main(String[] args) {
// in Set can not duplicate value 
Set<String>hs = new HashSet<String>();
		hs.add("Rajat");
		hs.add("kamal");
		hs.add("kajol");
			
		System.out.println(hs);
// contains to check value is avilable or not
		System.out.println(hs.contains("Rajat"));
//By using for loop
	for(String e: hs) {
		System.out.println(e);		
	}
//Iterator 
	Iterator<String> it =hs.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
// use remove
	hs.remove("kamal");
	System.out.println(hs);
	}

}
