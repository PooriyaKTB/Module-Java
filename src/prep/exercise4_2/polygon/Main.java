package src.prep.exercise4_2.polygon;

/**
 * Entry point for the polygon application.
 */
public class Main {

    public static void main(String[] args) {
        Polygon polygon = new Polygon(7);
        System.out.println(polygon.getNumberOfSides());
        polygon.describe();
    }
}

// Create a constructor that does not include this field, what happens?
// java: variable numberOfSides might not have been initialized

// Try to override the describe() method in Triangle. What error does the compiler give you?
// java: describe() in src.prep.exercise4_2.polygon.Triangle cannot override describe() in src.prep.exercise4_2.polygon.Polygon overridden method is final

// Try to compile the Triangle class. What error do you get?
// java: cannot inherit from final src.prep.exercise4_2.polygon.Polygon


// Why can’t you add a setter for numberOfSides?
// Because it's a final field, so java doesn't allow it to be reassigned

// How do final fields in Configuration and Polygon serve different purposes?
// In Configuration, MAX_USERS is a static final field, so it's a shared constant for all instances, but in Polygon, numberOfSides is an instance final field it means each object gets its own value in the constructor and locks it, so different instances can have different values.

// Why might a designer choose to make a class final?
// Make a class final to prevent inheritance, ensuring its behavior cannot be changed or extended by subclasses. so that our code security, reliability and maintainability will improve.