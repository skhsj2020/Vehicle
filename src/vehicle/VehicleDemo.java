package vehicle;

public class VehicleDemo {

	public static void main(String[] args) {
		Vehicle minivan  = new Vehicle();
		Vehicle sportscar = new Vehicle();
		int range1 , range2;
		// assign values to fields in minivan
		minivan.passengers =7;
		minivan.fuelcap = 16;  
		minivan.mpg = 21;
		
		// compute the range assuming a full tank of gas
		range1 = minivan.fuelcap * minivan.mpg;
		System.out.println("Minivan can carry " + minivan.passengers + 
				" with a range of " + range1);
		
		sportscar.passengers = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 12;
		
		range2 = sportscar.fuelcap * sportscar.mpg;
		
		System.out.println("Sportscar can carry " + sportscar.passengers + 
				" with a range of " + range2);

	}

}
