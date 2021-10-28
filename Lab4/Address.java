package Lab4;

public class Address { //Stores information about an address;
    private String street;
    private String city;
    private String county;

    public Address(String street, String city, String county) {
        setStreet(street);
        setCity(city);
        setCounty(county);
    }

    public String toString() {
        return "\n" + "The Address" + "\n" + "Street: " + getStreet() + "\n" + "City: " + getCity() + "\n" + "County: " + getCounty() + "\n";
    }

    public void setStreet(String street) {
        this.street = street;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setCounty(String county) {
        this.county = county;
    }
    public String getStreet() {
        return street;
    }
    public String getCity() {
        return city;
    }
    public String getCounty() {
        return county;
    }
}
