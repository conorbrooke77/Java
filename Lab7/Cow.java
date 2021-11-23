package Lab7;

public class Cow extends Animal {

    public Cow(String type, int age, char gender){
        super(type, age, gender);
    }

    public void eat() {
        System.out.println("Cow is eating.");
    }

    public void sleep() {
        System.out.println("Cow is sleeping.");
    }

    public void makeSound() {
        System.out.println("Cow is making a sound.");
    }
}
