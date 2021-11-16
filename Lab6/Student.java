package Lab6;

public class Student extends Person{
    private int numCourses;
    private String[] courses;
    private int[] grades;

    public Student(String name, String address) {
        super(name, address);

        courses = new String[10];
        grades = new int[10];
    }

    public String toString() {
        String temp = "";

        temp += "\n" + super.toString();

        for (int i = 0; i < numCourses; i++) {
            temp += "\n";
            temp += "\nCourse: " + courses[i];
            temp += "\nGrade: " + grades[i];
            temp += "\n";

        }
        return temp;
    }
    public void addCourseGrade(String course, int grade) {

        if (numCourses < course.length()) {
            courses[numCourses] = course;
            grades[numCourses] = grade;
    
            numCourses++;
        }
    }

    public void printGrades() {
        System.out.println("\nGrades");
        for (int i = 0; i < numCourses; i++) {
            System.out.print(grades[i] + " ");
        }
        System.out.println();
    }

    public double getAverageGrade() {
        int average = 0;
        for (int i = 0; i < numCourses; i++) {
            average += grades[i];
        }
        return average/numCourses;
    }

    public int getNumOfCourses() {
        return numCourses;
    }

    public int[] getGrades() {
        return grades;
    }

    public String[] getCourses() {
        return courses;
    }
}
