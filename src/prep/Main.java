package src.prep;

public class Main {
    public static void main(String[] args) {
        System.out.println("***Exercise 1.1***");

        Product pineapple = new Product("Pineapple", 1.20, 14);
        Product apple = new Product("Apple", 0.85);
        Product banana = new Product("Banana", 0.95, 23);

        System.out.println(pineapple);
        System.out.println(apple);
        System.out.println(banana);
    }
}

// Exercise 1.1:
// How did constructor overloading change the way Product objects could be created?
// Constructor overloading allows the user to either pass all required arguments or just pass name and price. so that, even if stockCount is not entered by the user, constructor overloading prevents a compile time error and initialises the stockCount to the default value of zero.

// What problem does constructor chaining with this() solve?
// Constructor chaining with this() makes our code cleaner, readable, maintainable, and also avoid redundant code (DRY principles).

// When you created multiple Product objects, how did the constructor arguments affect the state of each object?
// Constructor arguments as part of the method signature enable Java to decide which constructor should be executed, then any provided arguments will initialise the state of the object accordingly, while any unprovided arguments rely on chained constructor to set the default values.