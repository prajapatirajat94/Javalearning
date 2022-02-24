package arry.list;

public class Emp {
	
	public Emp Default(String un,String pw) {
		System.out.println("username : "+un+ "password is"+pw);
		return this;
	}

	public Emp Login() {
		System.out.println("i am in login page");
		return this;
	}
	public Emp Selectproduct(String product) {
		System.out.println("selected product: "+product);
		return this;
	}
	public Emp addTocart() {
		System.out.println("add to cart done");
		return this;
	}
	public Emp Logout() {
		System.out.println("i am logged out");
		return this;
	}
}
