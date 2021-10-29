package Lab4;

public class Office {
    private static int roomNumberRecords = 100;
    private final int OFFICECAPACITY = 2;

    private int roomNumber;
    private int currentNoEmployeesInOffice;
    private Employee[] employeesInOffice = new Employee[2];

    public Office() {
        this.roomNumber = roomNumberRecords;
        roomNumberRecords++;
    }

    public void assignEmployee(Employee employee) {
        if (currentNoEmployeesInOffice < OFFICECAPACITY) {
            employeesInOffice[currentNoEmployeesInOffice] = employee;
            currentNoEmployeesInOffice++;
        }
    }

    public int getNumberOfEmployeesAssigned() {
        return currentNoEmployeesInOffice;
    }
    public Employee getRecordOfEmployeeAssigned(int employeeIndex) {
        return employeesInOffice[employeeIndex];
    }
    public static int getTotalRooms() {
        return roomNumberRecords;
    } 
    public int getRoomNumber() {
        return roomNumber;
    }

    public String toString() {
        String temp = "\nOffice " + getRoomNumber() + "\n" + "\nNumber of Employees in office: " + getNumberOfEmployeesAssigned() + "\n\n" + "Employees Assigned ";

        for (int i=0; i <getNumberOfEmployeesAssigned(); i++) {
            temp += "\nEmployee Name: " + employeesInOffice[i].getName();
            temp += "\nEmployee Number: " + employeesInOffice[i].getEmployeeNumber();
        }
        return temp + "\n";
    }
}
