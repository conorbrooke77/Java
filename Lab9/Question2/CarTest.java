package Lab9.Question2;

public class CarTest{
	
	public static void main(String args[]){
		
        Car raceCar = new Car("Racecar", 4, 2, 1000000);
        Hgv hgv = new Hgv(100, 6, 8, 60000);

        System.out.println(raceCar.toString());
        System.out.println(raceCar.calculateDuty());

        System.out.println(hgv.toString());
        System.out.println(hgv.calculateDuty());
	}
}
