package InheritanceConcept;
/*
 * Abstract class can have body inside method
 * 0-100 % abstraction we can achieve
 * while in interface we can only achieve 100% abstraction
 */

public abstract class CarFeature {
	
public void CarEngine(String carname) {
	System.out.println(carname +" have Engine");
}

public void CarTire() {
	System.out.println("Car have Tire");

}

public void CarSeat() {
	System.out.println("Car have Seat");
}
}
