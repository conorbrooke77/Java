package Lab8.Question1;

public class Cylinder extends ThreeDShape {
	private double height;
	private double radius;
	
	public Cylinder(String name, String colour, double radius, double height) {
		super(name, colour);	
		setHeight(height);
		setRadius(radius);
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		double area = 2*Math.PI*radius*height + 2*Math.PI*Math.pow(radius,2);
		return area;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		double volume = Math.PI*Math.pow(radius, 2)*height;
		return volume;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

	public String toString() {
		return super.toString() +"\nRadius: " + radius + "\nHeight: " + height + "\nArea: " + area() + "\nVolume: " + volume();
	}
}
