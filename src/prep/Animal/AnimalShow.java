package src.prep.Animal;

/**
 * Responsible for managing the performance of animals in the show.
 */
public class AnimalShow {

    /**
     * Executes the sound performance for the given animal.
     * @param animal the animal instance expected to perform its sound
     */
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
