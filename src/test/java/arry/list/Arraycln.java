package arry.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Arraycln {

	public static void main(String[] args) throws Exception {
		ArrayList <String>ar = new ArrayList<String>();
		ar.add("abcd");
		ar.add("danger");
		ar.add("abc");
		ar.add("ab");	
		System.out.println(ar);
		//ArrayList<String>arcln = new ArrayList<String>(Arrays.asList("rajat","kamal"));
		//System.out.println(arcln);	
		/* Clone copy of arraylist*/
		ArrayList<String>arcln = (ArrayList<String>) ar.clone();
		//arranged it in ascending order 
		Collections.sort(arcln);
		System.out.println("clone copy : "+arcln);
	
	//System.out.println(ar);
	Iterator<String>it=ar.iterator();
	while(it.hasNext()) {
		String con = it.next();
		if(!con.contains("a")) {
			System.out.println(con);
		}
	}

		// Reverse string concept
		System.out.println(Reversestring("R"));
	}
public static  String Reversestring(String enter) {
	int len = enter.length();
	if(enter.length()==1) {
		return enter;
	}
	String rev = "";
	for(int i = len-1;i>=0;i--) {
		rev = rev + enter.charAt(i);
	}
	return rev;
}

}
