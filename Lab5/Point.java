package Lab5;

public class Point {
    protected int x;
    protected int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setCoordinateX(int x) {
        this.x = x;
    }

    public void setCoordinateY(int y) {
        this.y = y;
    }

    public int getCoordinateX() {
        return x;
    }

    public int getCoordinateY() {
        return y;
    }

    public String toString() {
        String temp = "";

        temp += "\nThe X coordinate is " + x + "\nThe Y coordinate is " + y;
        return temp;
    }
}  