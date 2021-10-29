package Lab4;

public class Car {
    private String type;
    private String brand;
    private String colour;

    public Car(String type, String brand, String colour) {
        this.type = type;
        this.brand = brand;
        this.colour = colour;
    }

    public String getType() {
        return type;
    }
    public String getBrand() {
        return brand;
    }
    public String getColour() {
        return colour;
    }

    public String toString() {
        return "\n" + "Car type: " + getType() + "\n" + "Car brand: " + getBrand() + "\n" + "Car colour:" + getColour() + "\n";
    }
}
