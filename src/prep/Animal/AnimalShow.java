package src.prep.Animal;

public class AnimalShow {
    public void perform(Animal animal) {
//        *** Now it's Animal class and its child classes which are responsible to do the action based on the type of Animal.***
//        ***(left commented for reference only)***
//        if (animal instanceof Dog) {
//            Dog dog = (Dog) animal;
//            dog.bark();
//        } else if (animal instanceof Cat) {
//            Cat cat = (Cat) animal;
//            cat.meow();
//        } else {
//            System.out.println("You have no animal yet!");
//        }

        animal.makeSound();
    }
}
