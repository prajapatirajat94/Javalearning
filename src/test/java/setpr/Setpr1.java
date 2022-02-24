package setpr;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Setpr1 {

	public static void main(String[] args) {
		
		
		Set<Integer> first = new HashSet<Integer>();
		first.addAll(Arrays.asList(new Integer[] {1,3,4,5,6,8,9,10}));
		
		Set<Integer> second = new HashSet<Integer>();
		second.addAll(Arrays.asList(new Integer[] {1,2,3,5,6,0,9}));
		// get the union 
		Set<Integer> union = new HashSet<Integer>(first);
		union.addAll(second);
		System.out.println(union);
		System.out.println("----------------------------");
		//get the intersection
		Set<Integer> intersection = new HashSet<Integer>(first);
		intersection.retainAll(second);
		System.out.println(intersection);
		System.out.println("----------------------------");
		//get differences 
		Set<Integer> diff = new HashSet<Integer>(first);
		diff.removeAll(second);
		System.out.println(diff);
	}

}
