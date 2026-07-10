package src.prep.BankAccount;

/**
 * Represents a bank account with basic transaction operations.
 */
class BankAccount {

    private double balance;

    /**
     * @deprecated
     * this method is no longer acceptable, because the app uses "deposit" or "withdraw" methods to manipulate the "balance"
     */
    private void setBalance(double balance) {
        if (balance > 0) this.balance = balance;
    }

    public double balanceCheck() {
        return balance;
    }

    /**
     * This method prints the message to the user as template literal. It has been created to avoid redundant code.
     * @param message the message text we want to send to user, providing format symbol.
     * @param field   the field that should be filled in the format symbol in the message text.
     */
    private void sendMessage(String message, double field) {
        System.out.println(String.format(message, field));
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            sendMessage("%.2f deposited", amount);
        } else {
            sendMessage("The amount %.2f is not valid, please make sure a positive amount is entered.", amount);
        }
    }

    /**
     * This method Processes a withdrawal request after validating the amount and available balance.
     * @param amount the given amount to withdrawal.
     */
    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            sendMessage("%.2f withdrawn", amount);
        } else if (amount <= 0) {
            sendMessage("Withdraw %.2f failed due to invalid amount entered.", amount);
        } else if( amount > this.balance){
            sendMessage("Withdraw %.2f failed due to insufficient balance.", amount);
        } else {
            sendMessage("Withdraw %.2f failed due to internal error, Please try again.", amount);
        }
    }
}
