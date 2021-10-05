package Lab2.Lab2b;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        length = 1;
        width = 1;
    }

    public void setLength(double length) {
        if (length > 0.0 && length <= 40.0) {
            this.length = length;
        } else {
            System.out.println("Invalid number, number has to be between 0.0 and 40.0, or equal to 40.0");
        }
    }

    public void setWidth(double width) {
        if (width > 0.0 && width <= 40.0) {
            this.width = width;
        } else {
            System.out.println("Invalid number, number has to be between 0.0 and 40.0, or equal to 40.0");
        }
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public String toString() {
		return "Length = " + length + ", Width = " + width;
    }

    public double getArea() {
        return (length * width);
    }

    public double getPerimeter() {
        return ((length * 2) + (width * 2));
    }

    public String printRectangle() {
        String temp = "";
        int count = 0;

        for (int i = 0; i < width; i++) {
            temp += "*";
        }
        for (int i = 0; i < (width*(length-2)); i++) {
            count++;
            if (count == 1) {
                temp += "\n*";
            } else if (count == width) {
                count = 0;
                temp += "*";
            } else {
                temp += " ";
            }
        }
        temp += "\n";
        for (int i = 0; i < width; i++) {
            temp += "*";
        }
        return temp;
    }
}