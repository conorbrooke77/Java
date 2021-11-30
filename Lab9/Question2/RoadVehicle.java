package Lab9.Question2;

public class RoadVehicle{
	private int wheels;	    //How many wheels it has
	private int passengers; //How many passengers it can carry
    private int value;
 
	public RoadVehicle() {
 		this(0,0,0);	
	}
 
	public RoadVehicle(int wheels, int passengers, int value) { 
		setWheels(wheels);
		setPass(passengers);
        setValue(value);
	}
 
    public void setValue(int value) {
		this.value = value;
		}
 
	public int getValue() {
		return value;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
		}
 
	public int getWheels() {
		return wheels;
		}
 
	public void setPass(int passengers) {
		this.passengers = passengers;
		}
 
	public int getPass() {
		return passengers;
		}

    public String toString() {
        return "\nNumber of wheels: " + wheels + "\nNumber of passengers: " + passengers + "\nValue of car: " + value;
    }
}