package Lab4;

public class MyHrDriver {
    public static void main(String[] args) {
        MyHr MyHr = new MyHr();

        MyHr.createEmployees();
        MyHr.assignEmployeesToOffice();

        System.out.println("\n\n"+MyHr.toString()+"\n");
    }
}
