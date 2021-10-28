package Lab4;

public class Employee {
    private static int employeeRecords = 1000;

    private Address address;
    private int employeeNumber;
    private String name;
    private int age;
    private String type;
    private Car companyCar = null;

    public Employee(Address address, String name, int age, String type) {
        this.address = address;
        this.employeeNumber = employeeRecords;
        setAddress(address);
        setname(name);
        setAge(age);
        setType(type);
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
            return companyCar;
        }
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setType(String type) {
        this.type = type;

        if (type.equals("Manager")) {
            companyCar = new Car("Focus", "Ford", "Blue");
        } else {
            System.out.println("You have to be Manager to own a company car!");
        }
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String toString() {
        String temp = "";

        return temp;
    }
}
