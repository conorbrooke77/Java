package Lab7;

public class Vet {
    private String name;

    public Vet(String name) {
        setName(name);
    }

    public void vaccinate(Animal animal) {
        System.out.println(getName() + " is vaccinating.");

        if (animal instanceof Dog) {
            System.out.println("Dog has been vaccinated " + animal.toString());
        } else {
            System.out.println("Cat has been vaccinated " + animal.toString());
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
