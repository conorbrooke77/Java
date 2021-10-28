package Lab4;

public class MyHR {
    public static void main(String[] args) {
        Address address = new Address("34 Street", "Scranton", "Ice Cream Land");
        Employee employee1 = new Employee(address, "Bob", 45, "Manager");
        Employee employee2 = new Employee(address, "Roger", 4, "Staff");

        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
    }
}
