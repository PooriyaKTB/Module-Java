package src.prep.Animal;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Poppy");
        Cat myCat = new Cat("Kitty");
        AnimalShow animalShow = new AnimalShow();

        animalShow.perform(myDog);
        animalShow.perform(myCat);

        animalShow.perform(new Parrot("Polly"));
    }
}

// Why did the original instanceof and casting approach fail when you added a new animal type?
// Because that approach needs to specifically include all new types of Animal in the if/else body and do casting to perform. As long as there is no condition to check for it and no casting only the default result will be shown.
// In other words, the perform method explicitly checked for each animal type using instanceof. when a new type like Parrot was added there was no condition to check and handle it, so the default message was printed.

// What does this reveal about how scalable this design is?
// It reveals that the original design was not scalable, because every time a new animal type is created the perform method must also include a new instanceof check and casting. Now we just need to override the makeSound method when creating a new type of Animal, so that our code is much more readable, maintainable and scalable.

// How did moving behaviour into the base Animal class change the design?
// Now any child class that extends Animal, inherits the makeSound method and can override it. there is no need to have massive and complicated if/else conditions for checking and casting all different types of Animals. this makes our code easier to maintain and extend.

// Why did the perform method stop needing to know the concrete animal types?
// Because now we have the method in the parent class and override it in each child class. so that the perform method only needs to call animal.makeSound method. Java automatically invokes the overridden method and perform method doesn't need to check and cast so specific animal type.

// How does this refactor demonstrate the real value of polymorphism?
// It shows that the same method call can produce different behavior based on the actual type of the object. we can have clearer code, with the same functionality and expected concrete result.
