package Lab6;

public class Teacher extends Person {
    private int numCourses;
    private String[] courses;

    public Teacher(String name, String address) {

        super(name, address);
        courses = new String[10];
    }

    public String toString() {
        String temp = "";
        return temp;

    }

    public boolean addCourse(String course) {

        if (numCourses < courses.length) {
            courses[numCourses] = course;
            numCourses++;
            return true;
        }
        return false;

    }

    public boolean removeCourse(String course) {
        for (int i = 0; i < numCourses; i++) {
            if (courses[i] == course) {
                courses[i] = " ";
            }
        }
        
        for (int i = 0; i < numCourses; i++) {
            for (int j = 0; j < numCourses; j++) {
                if (courses[i].compareTo(courses[j]) > 1) {

                }
            }
        }
        return false;


    }
}
