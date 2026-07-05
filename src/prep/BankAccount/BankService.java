package src.prep.BankAccount;

class BankService {
    /**
     * This method apply the withdrawal method from the given "BankAccount" instance.
     * @param account The specific instance that we want to invoke its method.
     * @param amount  The amount that we want to withdraw.
     */
    void withdraw(BankAccount account, double amount) {
        account.withdraw(amount);
    }

    /**
     * This method applies the deposit method from the given "BankAccount" instance.
     * @param account The specific instance that we want to invoke its method.
     * @param amount  The amount that we want to deposit.
     */
    void deposit(BankAccount account, double amount) {
        account.deposit(amount);
    }
}
