package src.prep.Product;

public class Main {

    public static void main(String[] args) {
        System.out.println("***Exercise 1.1***");

        Product pineapple = new Product("Pineapple", 1.20, 14);
        Product apple = new Product("Apple", 0.85);
        Product banana = new Product("Banana", 0.95, 23);

        System.out.println(pineapple);
        System.out.println(apple);
        System.out.println(banana);

        System.out.println("***Exercise 1.2***");
        Product p1 = new Product("Laptop", 900);
        Product p2 = new Product(p1);
        p2.setPrice(1100);
        System.out.println(p1.getPrice());
        System.out.println(p2.getPrice());
    }
}

// Exercise 1.1:
// How did constructor overloading change the way Product objects could be created?
// Constructor overloading allows the user to either pass all required arguments or just pass name and price. so that, even if stockCount is not entered by the user, constructor overloading prevents a compile time error and initialises the stockCount to the default value of zero.

// What problem does constructor chaining with this() solve?
// Constructor chaining with this() makes our code cleaner, readable, maintainable, and also avoid redundant code (DRY principles).

// When you created multiple Product objects, how did the constructor arguments affect the state of each object?
// Constructor arguments as part of the method signature enable Java to decide which constructor should be executed, then any provided arguments will initialise the state of the object accordingly, while any unprovided arguments rely on chained constructor to set the default values.

// Exercise 1.2:
// Why did changing p2 also change p1?
// It happens because both p1 and p2 basically stored the reference of object and pointing to same object in the heap, so that any changes applied to the state of one will apply to the other one.

// What does this tell you about what p1 and p2 actually store?
// It tells us that they are storing only the object's address in the heap, which is the object's reference.

// How did your fix prevent changes to p2 from affecting p1?
// We can create p2 directly using the "new" keyword like: Product p2 = new Product("Laptop", 900), or even the better way is to create a copy constructor that gets Product object as the argument and copy its field states. Therefore, we create two new class instances (not copying the same reference into the second one).

// What new object(s) existed after your change compared to before?
// Now we have p1 and p2 as two separate objects with same fields states, while before, we had just one object with two variable pointing to it.

// How could this kind of reference behaviour cause bugs in a larger codebase if it’s not well understood?
// It may cause unwanted changes applied on the other instances of the object (shared instances). also it can cause a big mess-up when we think we are instantiating new objects, when we are actually just referencing different variables to the exact same object instead.