package Lab8.Question1;

public class Triangle extends TwoDShape{

    private double base;
    private double height;

    public Triangle(String name, String colour, double base, double height) {
        super(name, colour);
        //TODO Auto-generated constructor stub
        setBase(base);
        setHeight(height);
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    @Override
    public double area() {
        return 0.5 * base * height;
    }
    
    public String toString() {
        return super.toString() + "\nBase: " + base + "\nHeight: " + height;
    }
    
}
