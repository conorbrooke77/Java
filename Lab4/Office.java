package Lab4;

public class Office {
    private static int nextRoomNumber = 100;
    private final int OFFICECAPACITY = 2;

    private int roomNumber;
    private Employee[] employeesInOffice = new Employee[2];

    public Office() {
        this.roomNumber = nextRoomNumber;
        nextRoomNumber++;
    }

    public void assignEmployee(Employee employee) {
        if (employeesInOffice.length < OFFICECAPACITY) {
            employeesInOffice[employeesInOffice.length-1] = employee;
        }
    }

    public int getNumberOfEmployeesAssigned() {
        return employeesInOffice.length;
    }
    public static int getnextRoomNumber() {
        return nextRoomNumber;
    }
    public int getRoomNumber() {
        return roomNumber;
    }

    public String toString() {
        return "";
    }
}
