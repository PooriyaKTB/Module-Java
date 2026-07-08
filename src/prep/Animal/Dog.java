package src.prep.Animal;

public class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

//    *** The method below has been moved to the Animal class as the makeSound method, each child class override makeSound() to provide its own behavior.***
//    ***(left commented for reference only)***
//    public void bark() {
//        System.out.println(getName() + " barked...!");
//    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " barked...!");
    }
}
