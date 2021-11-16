package Lab7;

public class Test {
    public static void main(String[] args) {
        Animal dog = new Dog("Husky", 999, "Male");
        Animal cat = new Cat("House Cat", 10, "female");

        Vet vet = new Vet("The Best Vet");

        vet.vaccinate(dog);
        vet.vaccinate(cat);

    }
}
