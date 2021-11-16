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
            if (courses[i] == course) { //Finds the course in courses array
                courses[i] = ""; //Changes course to empty string;
            }
        }
        for (int i = 0; i < numCourses; i++) {
            for (int j = 0; j < numCourses; j++) {
                if (courses[i].compareTo(courses[j]) > 0) {
                    System.out.println(courses[j]);
                    String temp = courses[i];
                    courses[i] = courses[j];
                    courses[j] = temp;
                }
            }
        }

        if (numCourses == 0 || courses[numCourses-1] != "") {
            return false;
        } else {
            courses[numCourses-1] = null; // Changes the empty String at the end of the array to null;
            numCourses--; //The course is then removed fromthe total;

            return true;
        }
    }
}
