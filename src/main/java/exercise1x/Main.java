package exercise1x;

public class Main {

    public static void main(String[] args) {

        StatementSender email = new EmailStatementSender();
        StatementSender letter = new LetterStatementSender();

        StatementDeliveryService statementDeliveryService = new StatementDeliveryService();
        statementDeliveryService.deliverStatement("hi there", email);
        statementDeliveryService.deliverStatement("bye there", letter);

        System.out.println("*** Exercise 1.2 ***");

        StatementService statementService = new StatementService();

        statementService.createAllTransactionStatement(email);
        statementService.createAllTransactionStatement(letter);
        statementService.createOutgoingTransactionStatement(letter);

    }
}

/*

** Exercise 1.1 **

- Look at the example you just created. Why was it useful to use an interface? How would it look if we had only used classes - can you think of any problems that might cause?
- 1) Interface is stateless, it means our code is more flexible.
  2) By using Interface, our code is much more open to extend in the future, as each class can implement many interfaces but just one class. and it follows OCP.
  3) By using class and inheritance, we are actually saying that childClass IS-A SuperClass, which is not true here, because interface is a contract for a behavior only, so when class implement the interface, they actually CAN-DO what interface offers. (Coupling)
  apart tahat, we had to create logic to differentiate statementSender types.

- How will the use of interfaces make the code more maintainable in future? What if we decide we also want the option to send statements via text message?
- As it follows Open/Close principle, it is maintainabe for instance if we want to add a new sending statement method, we can just implement new class and simply override the behavior

- How does using an interface enforce the contract that it sets out? Again think about writing a new text message implementation.
- When a class implements an interface, it has to follow the contracts that interface made, as long as he class does not implement all abstract constants and methods, compiler will complain.

- Similarly, what if we decide in future that physical letters are no longer supported; which code do we need to update?
- By adding @Deprecated annotation for developers (or completly delete it) and updating the specfic class that we want to apply changes on, we can add feature or deactivate existed class/behavor

- Think about how you would test exercise1x.StatementDeliveryService. In practice you wouldn’t want to send an actual email or a letter every time you ran the test, so how could the exercise1x.StatementSender interface help here?
  (NB our expectation here is for a testing-implementation as they won’t have covered mocking yet
- with Dummy implementation?! I'm not sure, but I've done it with a fake class, I think we call it dummy implementation!
  so that instead of doing actual job, and sending email or any expensive action, we can simply make sure that the specific method that we need has been invoked!

 */