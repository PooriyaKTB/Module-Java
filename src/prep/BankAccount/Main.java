package src.prep.BankAccount;

public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankService service = new BankService();

        service.deposit(account, 100);
        service.deposit(account2, 300);
        service.deposit(account2, 0);
        service.withdraw(account2, 150);
        service.withdraw(account2, 350);

        System.out.println("Balance: " + account.balanceCheck());
        System.out.println("Balance: " + account2.balanceCheck());
    }
}


// How did making balance private change how the system had to interact with BankAccount?
// It makes any part of the system that wants to interact with BankAccount's balance field, must use the BankAccount modifier methods, (because balance field is private). so that we can ensure that the balance of BankAccount is safe and prevent any direct changes.

// Why is it better for BankAccount to manage its own deposits and withdrawals rather than BankService?
// As it's safer to set access modifier of sensitive fields to private, we kinda have to leave the manipulation responsibility to the class itself. So that no unwanted changes will happen.

// How does this refactor make misuse of BankAccount harder or impossible?
// By ensuring that neither a part of our application nor direct injection (from other developers) can change the amount of sensitive fields. Apart that, we prevent unaccepted arguments by validating it before any manipulation happens.