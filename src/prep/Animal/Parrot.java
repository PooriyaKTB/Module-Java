package src.prep.Animal;

public class Parrot extends Animal {

    Parrot(String name) {
        super(name);
    }

//    *** The method below has been moved to the Animal class as the makeSound method, each child class override makeSound() to provide its own behavior.***
//    ***(left commented for reference only)***
//    public void squawk(){
//        System.out.println(getName() + " squawked...!");
//    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " squawked...!");
    }
}
