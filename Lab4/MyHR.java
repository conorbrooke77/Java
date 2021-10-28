package Lab4;

import java.util.Scanner;

public class MyHR {
    private Scanner sc = new Scanner(System.in);
    private Office[] offices = new Office[3];
    private Employee[] employees = new Employee[5];

    public void createEmployees() {

        for (int noOfEmployees = 0; noOfEmployees < employees.length; noOfEmployees++) {

            System.out.println("\nNew Employee Form\n");

            /* Personal Details */
            System.out.println("Enter Name: ");
            String name = sc.nextLine();
            System.out.println("Enter Age: ");
            int age = Integer.parseInt(sc.nextLine());
            System.out.println("Staff Type\n Manager or Staff");
            String type = sc.nextLine();

            /* Address Details */
            System.out.println("Enter Employees Street: ");
            String street = sc.nextLine();
            System.out.println("Enter Employees City: ");
            String city = sc.nextLine();
            System.out.println("Enter Employees County: ");
            String county = sc.nextLine();

            /* Creating the instances */
            Address address = new Address(street, city, county);
            Employee employee = new Employee(address, name, age, type);

            employees[noOfEmployees] = employee;
        }
    }

    public void createOffices() {
        for (int noOfOffice = 0; noOfOffice < offices.length; noOfOffice++) {
            Office office = new Office();

            offices[noOfOffice] = office;
        }
    }

    public void assignEmployeesToOffice() {
        int officesAvialable = 3;
        for (int employeesAssigned = 0; employeesAssigned < employees.length; employeesAssigned++) {
            if (offices[officesAvialable-1].getNumberOfEmployeesAssigned() < 2) {
                offices[officesAvialable-1].assignEmployee(employees[employeesAssigned]);

                if (offices[officesAvialable-1].getNumberOfEmployeesAssigned() == 2) {
                    officesAvialable--;
                }
            }
        }
    }

    public String toString() {
        String temp = "";

        for (int i = 0; i < employees.length; i++) {
            temp += employees[i].toString();
        }

        for (int i = 0; i < offices.length; i++) {

        }

        return temp;
    }
}
