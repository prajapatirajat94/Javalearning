package arry.list;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class Comparearry {

	public static void main(String[] args) {
		String []lang = {"java","javascript","ruby","c","python","java","python"};

		//1 Compare element:Time complexity on2----Worst solution
		for(int i=0;i<lang.length;i++) {
			for(int j=i+1;j<lang.length;j++) {
				if(lang[i].equals(lang[j])) {
					System.out.println("duplicate element is : " + lang[i]);					
				}
			}			
		}
		System.out.println("-------------------------------");
//2 Using hashset: java collection stores unique value (O)n
		Set<String>store = new HashSet<String>();
	for(String name : lang) {
		if(store.add(name)==false) {
			System.out.println("Dup value is: "+ name);
		}
	}
	System.out.println("-------------------------------");
//3 using hashmap
	HashMap<String,Integer> storemap = new HashMap<String,Integer>();
	for(String nam:lang) {
		Integer count = storemap.get(nam);
		if(count == null) {
			storemap.put(nam, 1);
		}
		else {
			storemap.put(nam, ++count);
		}
	}
	// iterate
	Set<Entry<String, Integer>> entrySet =storemap.entrySet();
	for(Entry<String, Integer> e:entrySet) {
		if(e.getValue()>1) {
			System.out.println("Dup element is: "+e.getKey());
		}
	}
	}

}
