package Lab8.Question2;

public class Student extends Person{
    private String course;

    public Student(String name, String course) {
        super(name);
        setCourse(course);
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return "A Student studying " + course;
    }

    public String toString() {
        return super.toString() + "\nCourse: " + course;
    }
}
