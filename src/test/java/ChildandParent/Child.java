package ChildandParent;

public class Child extends Parents {

	public Child(int i,int j) {
		super(i, j);
		//System.out.println(i+" & "+j+" is from Child class");
		
	}

	public static void main(String[]args) {
		
		Child c= new Child(5,6);
		
	}
	
	
	
}
