package Lab8.Question2;

public abstract class Person {
    private String name;

    public Person(String name) {
        setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String getDescription();

    public String toString() {
        return "\nName: " + name;
    }
}
