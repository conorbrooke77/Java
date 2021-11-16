package Lab7;

public abstract class Animal {
    protected String type;
    protected int age;
    protected String gender;

    public Animal(String type, int age, String gender) {
        setAge(age);
        setGender(gender);
        setType(type);
    }
    
    public String toString() {
        return "\n\nType: " + type + "\nAge: " + age + "\nGender: " + gender + "\n";
    }

    public void eat() {
        System.out.println("Animal is eating.");
    }

    public void sleep() {
        System.out.println("Animal is sleeping.");
    }

    public void makeSound() {
        System.out.println("Animal is making a sound.");
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {

        if (gender.toLowerCase().equals("male") || gender.toLowerCase().equals("female")) {
            this.gender = gender;
        } else {
            System.out.println("The gender type is invalid!");
        }
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}
