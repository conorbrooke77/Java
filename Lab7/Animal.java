package Lab7;

public abstract class Animal {
    protected String type;
    protected int age;
    protected char gender;

    public Animal(String type, int age, char gender) {
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

    public void setGender(char gender) {
        switch (gender) {
            case 'm': 
                this.gender = gender;
                break;
            case 'f':
                this.gender = gender;
                break;
            case 'M': 
                this.gender = gender;
                break;
            case 'F':
                this.gender = gender;
                break;
            default: 
                System.out.println("The gender type is invalid!");
        }
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }
}
