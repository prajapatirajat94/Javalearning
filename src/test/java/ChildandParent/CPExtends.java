package ChildandParent;

public class CPExtends extends Child {

	public CPExtends(int i, int j) {
		super(i, j);
		
	}

	public static void main(String[] args) {
		Child cp=new Child(5,7);
		CPExtends cpp = new CPExtends(1,2);
		

	}

}
