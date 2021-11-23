package Lab7;

public class Cat extends Animal{
    
    public Cat(String type, int age, char gender){
        super(type, age, gender);
    }

    public void eat() {
        System.out.println("Cat is eating.");
    }

    public void sleep() {
        System.out.println("Cat is sleeping.");
    }

    public void makeSound() {
        System.out.println("Cat is making a sound.");
    }
}
