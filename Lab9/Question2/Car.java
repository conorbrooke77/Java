package Lab9.Question2;

public class Car extends RoadVehicle implements ImportDuty{
	private String carType;
 
	public Car() {
	 	this("", 0, 0, 0);
	 	}
 
	public Car(String carType, int wheels, int passengers, int value) { 
		super(wheels, passengers, value);
		setType(carType);
	}
 
	public void setType(String carType) {
		this.carType = carType;
	}
 
	public String getType() {
		return carType;
	}

    @Override
    public double calculateDuty() {
        return super.getValue() * CARTAXRATE;
    }

    public String toString() {
        return super.toString() + "\nCar Type: " + carType;
    }
}
