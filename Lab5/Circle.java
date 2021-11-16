package Lab5;

public class Circle extends Point{
    private int radius;

    public Circle(int x, int y, int raduis) {
        super(x, y);
        
        this.radius = raduis;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
} 
