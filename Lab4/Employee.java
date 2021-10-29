package Lab4;

public class Employee {

    private static int employeeRecords = 1000;
    private Car companyCar = null;

    private Address address;
    private String name;
    private String type;
    private int employeeNumber;
    private int age;

    public Employee(Address address, String name, int age, String type) {
        this.employeeNumber = employeeRecords;
        ++employeeRecords;

        setname(name);
        setAge(age);
        setType(type);
        setAddress(address);
    }

    public static int getNoOfEmployees() {
        return employeeRecords;
    }
    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public Car getCar() {
        try {
            return companyCar;
        } catch (NullPointerException e) {
            System.out.println("Only Mangers have access to company cars!");
        }
        return companyCar;
    }
    
    public void setCar() {
        if (type.equals("Manager")) {
            companyCar = new Car("Focus", "Ford", "Blue");
        }
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String toString() {
        String temp = "";
        temp += "\nEmployee " + getEmployeeNumber() + "\n";
        temp += "\nEmployee Name: " + getName() + "\nEmployee Age: " + getAge() + "\nEmployee Type: " + getType() + "\n" + getAddress().toString();

        if (type.equals("Manager")) {
            temp += getCar().toString();
        }
        return temp;
    }
}
