package Lab7;

public class VetTest {
    
    private static Vet vet = new Vet("Best Vet");

    public static void main(String[] args) {

        Animal dog = new Dog("Husky", 10, 'M');
        vet.vaccinate(dog);

        Dog d = (Dog) dog;
        d.wagTail();
        System.out.println(d.getType());

        Animal cat = new Cat("House Cat", 3, 'F');
        vet.vaccinate(cat);
    }
}
