package Lab7;

public class Dog extends Animal {
    public Dog(String type, int age, char gender){
        super(type, age, gender);
    }

    public void eat() {
        System.out.println("Dog is eating.");
    }

    public void sleep() {
        System.out.println("Dog is sleeping.");
    }

    public void makeSound() {
        System.out.println("Dog is making a sound.");
    }

    public void wagTail() {
        System.out.println("Dog wags tail!");
    }

    public void bark() {
        System.out.println("Bark!");
    }
}
