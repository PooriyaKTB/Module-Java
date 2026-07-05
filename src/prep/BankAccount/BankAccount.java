package src.prep.BankAccount;

class BankAccount {
    private double balance;

    // *** "setBalance" method is actually a dead code right now and can be omitted, because app use "deposit" or "withdraw" methods to manipulate the "balance"
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
     * This method ensures that the given amount can be withdrawn by checking whether it's less than or equal to current balance, then if it was approved do the withdrawal or send the unsuccessful message.
     * @param amount the given amount for withdrawal.
     */
    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            sendMessage("%.2f withdrawn", amount);
        } else {
            sendMessage("Withdraw %.2f failed due to insufficient balance or invalid amount entered.", amount);
        }
    }
}
