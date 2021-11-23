package Lab8;

public class Rectangle extends TwoDShape{
    private double length;
    private double width;

    public Rectangle(String name, String colour, double length, double width) {
        super(name, colour);
        setLength(length);
        setWidth(width);
    }
    
    @Override
    public double area() {
        double area = length * width;

        return area;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
    	return width;
    }
    
    public String toString() {
        return super.toString() + "\nLength: " + length + "\nWidth: " + width + "\nArea: " + area();
    }
}
