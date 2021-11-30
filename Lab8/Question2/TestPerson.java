package Lab8.Question2;

public class TestPerson {
    private static Person[] people = new Person[2];

    public static void main(String[] args) {
        Employee employee1 = new Employee("Robert", 25300);
        people[0] = employee1;

        Student student1 = new Student("Ben", "Computer Science");
        people[1] = student1;

        for(int i = 0; i < people.length; i++) {
            System.out.println(people[i].toString());
            System.out.println(people[i].getDescription());
        }
    }
}
