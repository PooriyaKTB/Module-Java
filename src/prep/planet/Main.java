package src.prep.planet;

public class Main {

    public static void main(String[] args) {
        Planet earth = new Planet("Earth");
        System.out.println(Planet.getPlanetCount());
        Planet mars = new Planet("Mars");
        Planet jupiter = new Planet("Jupiter");
        System.out.println(Planet.getPlanetCount());
        System.out.println(earth.getPlanetCount()); // This works, but doesn't count the earth object, just returns the total number of Planet objects created.
    }
}


// What happens if you try to reference the instance’s name field in this method?
// It's not possible, because the method is static and belongs to the class while name belongs to an instance object, and static method cannot directly access instance fields

// What happens when you print earth.getPlanetCount(), why is this confusing?
// It returns the value of planetCount field in the class. it can be confusing because it looks like the method belongs to the earth object, but it is actually a static method that belongs to the Planet class and returns the total number of Planet objects created

// Why does planetCount have to be static, while name should not be?
// Because planetCount belongs to the class, not instances, while name belongs to each instance of the class

// Why is it important that getPlanetCount() is static?
// Because only when its static we can invoke it independent to instances. in other words, it operates on class variable and can be called without creating a Planet object

// What are some of the dangers of using global static variables?
// Static fields are accessible for all instances, so changing static field can affect all instances as well. it makes code readability, testing and debugging become much harder.

// What would happen if planetCount were an instance field instead?
// It would always equal to 1, as each Planet instance would have its own planetCount and constructor increase it only once when the object is created