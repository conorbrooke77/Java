package Lab8.Question1;

public class Circle extends TwoDShape {
    private double radius;

    public Circle(String name, String colour, double radius) {
        super(name, colour);
        setRadius(radius);
    }
    
    @Override
    public double area() {
        double area = Math.PI*Math.pow(radius,2);
        return area;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public String toString() {
        return super.toString() + "\nRadius: " + radius + "\nArea: " + area();
    }
}
