package arry.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

import org.testng.Assert;

public class Arraylistpractice {

	public static void main(String[] args) {
String r = "10";
int i = Integer.parseInt(r);
System.out.println(i);
String []a =new String[1];
a[0]="rajat";
System.out.println(a[0]);
ArrayList <String>ar = new ArrayList<String>();
ar.add("rajat");
ar.add("kamal");
ar.add("naveen");
ar.add("cheena");
ArrayList <String>as = new ArrayList<String>();
as.add("ajay");
as.add("ravi");
as.add("gaurag");
as.add("raja");
ar.retainAll(as);

System.out.println(ar);
System.out.println(ar.isEmpty());
if(ar.isEmpty()) {
	System.out.println("No same items");
}
else {
	System.out.println("there are same items");
}

	}

}
