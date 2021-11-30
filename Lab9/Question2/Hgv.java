package Lab9.Question2;

public class Hgv extends RoadVehicle implements ImportDuty {
	private int cargo;

	public Hgv(){ 	
		this(0,0,0,0);	
	}

	public Hgv(int cargo, int wheels, int passengers, int value){ 
		super(wheels, passengers, value);
		setCargo(cargo);
	}

	public void setCargo(int cargo){
		this.cargo = cargo;
		}

	public int getCargo(){
		return cargo;
		}

    @Override
    public double calculateDuty() {
        // TODO Auto-generated method stub
        return super.getValue() * HGVTAXRATE;
    }	

    public String toString() {
        return super.toString() + "\nCargo: " + cargo;
    }
}
