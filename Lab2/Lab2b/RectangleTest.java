package Lab2.Lab2b;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(5.0);
        rectangle.setLength(7.0);

        Rectangle rectangle2 = new Rectangle();
        rectangle2.setWidth(10.0);
        rectangle2.setLength(4.0);

        System.out.println(rectangle.toString());
        System.out.println("Area = " + rectangle.getArea());
        System.out.println("Perimeter = " + rectangle.getPerimeter());
        System.out.println(rectangle.printRectangle());
        System.out.println();
        System.out.println(rectangle2.toString());
        System.out.println("Area = " + rectangle2.getArea());
        System.out.println("Perimeter = " + rectangle2.getPerimeter());
        System.out.println(rectangle2.printRectangle());
    }
}
