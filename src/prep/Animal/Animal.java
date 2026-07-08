package src.prep.Animal;

public class Animal {
    final private String name;

    Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void makeSound() {
        System.out.println(getName() + " made sound...!");
    }
}
