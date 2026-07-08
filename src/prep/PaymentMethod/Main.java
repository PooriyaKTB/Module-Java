package src.prep.PaymentMethod;

public class Main {
    public static void main(String[] args) {
        System.out.println("*** Payment.pay() ***");
        PaymentMethod payment = new PaymentMethod();
        payment.pay(9.99);
        payment.pay(9.99, "£");

        System.out.println("*** DirectDebit.Pay() ***");
        DirectDebit directDebit = new DirectDebit();
        directDebit.pay(10.99);
        directDebit.pay(10.99, "£");

        System.out.println("*** DirectDebitPayment.pay() ***");
        PaymentMethod directDebitPayment = new DirectDebit();
        directDebitPayment.pay(10.99);
        directDebitPayment.pay(10.99, "£");
    }
}

// How does Java choose between overloaded methods?
// Java chooses between overloaded methods at compile time. It compares the method signatures with the arguments passed to the method and selects the most appropriate matching method.

// How does Java choose an overridden method at runtime?
// Java at compile time checks if the invoked method exists in the parent class (SuperClass), but in Runtime it checks the object itself for the invoked method
// Actually at Compile time Java checks the reference type to ensure the invoked method exists, but in Runtime Java checks the actual instance (object) in memory for the invoked method (*** I think we call it Dynamic Binding!)

// Why can overloading sometimes be confusing or misleading when reading code?
// It can be confusing because multiple methods have the same name (and maybe behavior) but different argument types or the number of arguments which van be confusing. It can be hard to find out which method is being called without properly checking the arguments.
// If the method identifier is generic or unclear (about the method responsibility) it wil become a big deal to understand the code.

// How does this exercise reinforce the difference between “same method name” and “same behaviour”?
// It shows that having the same method name does not guarantee the same behavior. Overloaded methods have the same name but different parameters, while overridden methods have the same method signature but can perform different behavior depending on the actual object at runtime.