package Lab4;
import java.util.Scanner;

public class MyHr {
    
    private Scanner sc = new Scanner(System.in);
    private Office[] offices = new Office[3];
    private Employee[] employees = new Employee[5];

    public MyHr() {
        createOffices();
    }

    public void createOffices() {
        for (int noOfOffice = 0; noOfOffice < offices.length; noOfOffice++) {
            Office office = new Office();

            offices[noOfOffice] = office;
        }
    }

    public void createEmployees() {

        for (int noOfEmployees = 0; noOfEmployees < employees.length; noOfEmployees++) {
            /* Personal Details */
            System.out.println("\nNew Employee Form \nEnter Name: ");
            String name = sc.nextLine();
            System.out.println("\nEnter Age: ");
            int age = Integer.parseInt(sc.nextLine());
            System.out.println("\nStaff Type\nManager or Staff");
            String type = sc.nextLine();

            /* Address Details */
            System.out.println("\nAddress Details \n\nEnter Employees Street: ");
            String street = sc.nextLine();
            System.out.println("\nEnter Employees City: ");
            String city = sc.nextLine();
            System.out.println("\nEnter Employees County: ");
            String county = sc.nextLine();

            /* Creating the instances */
            Address address = new Address(street, city, county);
            Employee employee = new Employee(address, name, age, type);
            employees[noOfEmployees] = employee;
        }
    }

    public void assignEmployeesToOffice() {
        int officesUsed = 0;
        for (int employeesAssigned = 0; employeesAssigned < employees.length; employeesAssigned++) {
            if (offices[officesUsed].getNumberOfEmployeesAssigned() < 2) {
                offices[officesUsed].assignEmployee(employees[employeesAssigned]);

                if (offices[officesUsed].getNumberOfEmployeesAssigned() == 2) {
                    officesUsed++;
                }
            }
        }
    }

    public String toString() { // Lists all Employees, lists all offices and which employees are assigned to each office.
        String temp ="MyHr\n";

        for (int i = 0; i < employees.length; i++) {
            temp += employees[i].toString();
        }
        for (int i = 0; i < offices.length; i++) {
            temp += offices[i].toString();
        }
        return temp;
    }
}
