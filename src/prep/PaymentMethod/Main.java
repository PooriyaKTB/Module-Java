package src.prep.PaymentMethod;

public class Main {
    public static void main(String[] args) {
        System.out.println("*** Payment.pay() ***");
        PaymentMethod payment = new PaymentMethod();
        payment.pay(9.99);
        payment.pay(9.99, "£");
        System.out.println();

        System.out.println("*** DirectDebit.Pay() ***");
        DirectDebit directDebit = new DirectDebit();
        directDebit.pay(10.99);
        directDebit.pay(10.99, "£");
        System.out.println();

//        *** Just to check ***
        System.out.println("*** directDebitPayment.pay() ***");
        PaymentMethod directDebitPayment = new DirectDebit();
        directDebitPayment.pay(10.99);
        directDebitPayment.pay(10.99, "GBP");
        System.out.println();

//        Exercise 3.3 stretch task:
        System.out.println("*** Exercise 3.3 stretch task ***");
        Checkout checkout = new Checkout();
        CouponPayment coupon = new CouponPayment();
        checkout.processPayment(10.50);
        checkout.setPaymentMethod(directDebit);
        checkout.processPayment(9.99);
        checkout.setPaymentMethod(coupon);
        checkout.processPayment(5.0);
        checkout.setPaymentMethod(payment);
        checkout.processPayment(10.99);
    }
}

// *** Exercise 3.2 - Overloading vs Overriding ***
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


// *** Exercise 3.3 - Composition vs Inheritance ***
// Why did you choose HAS-A (or IS-A) for the Checkout and PaymentMethod relationship?
// I chose HAS-A, Because Checkout is not a payment method, it just has a method of payment, so it uses it to process payments.

// What reasoning helped you decide which relationship makes sense?
// Checking if the Checkout is expected to have behavior like PaymentMethod, or we need to have similar behavior as part of it !
// I asked myself whether a Checkout is a type of PaymentMethod or it simply uses one. Since a Checkout only uses a PaymentMethod to process payments HAS-A relationship makes more sense.

// How does your choice affect the design and functionality of the Checkout class?
// Now by choosing HAS-A approach, Checkout remains independent of implementation of PaymentMethod, so that the payment method can be easily replaced without changing the Checkout class.

// What would happen if you chose the wrong relationship?
// I was not able to extend my code to add new behavior to the Checkout class, as I did when I added a method to change the payment method.
// by choosing IS-A relationship it did not represent the real-world relationship correctly because a Checkout is not a Payment method. It also made the code harder to maintain and extend.

// How do IS-A and HAS-A relationships help you think about code reuse and composition in real applications?
// IS-A basically relaying on the Parent/SuperClass, our functionality implementation is limited. but with HAS-A approach we can have a method to change the paymentMethod.
// IS-A enables code reuse via inheritance when a class is a specific version of another class. HAS-A allows objects to work together without creating a strong inheritance relationship.
// *** I'm not really sure if we can mention "coupling" as well ?! like we do Coupling in IS-A, but not in HAS-A?!
// *** Can we say: IS-A refers to Inheritance, while HAS-A refers to Composition ?!

// Can you imagine other classes where this distinction is important?
// Refund HAS-A PaymentMethod, CreditCardPayment  IS-A PaymentMethod.
// Car HAS-A Engine OR House HAS-A Door & Dog IS-A Animal OR Cat IS-A Animal.
