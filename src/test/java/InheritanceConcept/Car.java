package InheritanceConcept;

public class Car extends CarFeature {
	

public void CarEngine(String carnema) {
	System.out.println(carnema+" car have updated Engine");
}




public static void main (String[]args) {
	
	Car c = new Car();
	c.CarSeat();
	c.CarEngine("Honda");
}
}
