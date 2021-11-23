package Lab8;

public class Sphere extends ThreeDShape {
    private double radius;

    public Sphere(String name, String colour, double radius) {
		super(name, colour);	
		setRadius(radius);
    }

    @Override
    public double volume() {
        // TODO Auto-generated method stub
        double volume = (4.0/3.0)*Math.PI*Math.pow(radius, 3);
        return volume;
    }

    @Override
    public double area() {
        // TODO Auto-generated method stub
        double area = 4*Math.PI*Math.pow(radius, 2);
        return area;
    }
	
	public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public String toString() {
		return super.toString() +"\nRadius: " + radius + "\nArea: " + area() + "\nVolume: " + volume();
	}
}
