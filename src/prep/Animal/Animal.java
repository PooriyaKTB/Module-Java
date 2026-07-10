package src.prep.Animal;


/**
 * Represents a generic animal.
 * This class serves as a base class for specific animal types.
 */
public class Animal {

    final private String name;

    Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    /**
     * Prints a generic sound made by the animal.
     * This method can be overridden by subclasses to provide specific animal sounds.
     */
    public void makeSound() {
        System.out.println(getName() + " made sound...!");
    }
}
