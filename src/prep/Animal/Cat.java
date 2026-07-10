package src.prep.Animal;

public class Cat extends Animal {

    Cat(String name) {
        super(name);
    }

//    *** The method below has been moved to the Animal class as the makeSound method, each child class override makeSound() to provide its own behavior.***
//    ***(left commented for reference only)***
//    public void meow() {
//        System.out.println(getName() + " meowed...!");
//    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " meowed...!");
    }
}
