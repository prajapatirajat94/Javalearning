package arry.list;

public class Pagelogin {

	public static void main(String[] args) {
		Emp shop = new Emp();
		shop.Default("Rajat1234","password123").Selectproduct("Airpod")
		.addTocart()
		.Logout();

	}

}
