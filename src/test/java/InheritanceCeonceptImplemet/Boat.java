package InheritanceCeonceptImplemet;


public class Boat implements  BoatFeature {

	@Override
	public void BoatEngine(String BoatName) {
		System.out.println(BoatName+ " have Boat Engine");
	}

	@Override
	public void BoatTire(String BoatName) {
		System.out.println(BoatName+ " have Boat Tire");
		
	}

	@Override
	public void BoatSeat(String BoatName) {
		System.out.println(BoatName+ " have Boat Seat");
	}

	public static void main(String[]args) {
		
		Boat b = new Boat();
		b.BoatEngine("Honda");
	}
}
