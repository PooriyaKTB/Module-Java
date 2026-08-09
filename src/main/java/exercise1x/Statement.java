package exercise1x;

/**
 * Represents a bank statement.
 */
public interface Statement {

    String getPeriod();
    int getAccountNumber();
    String getCustomerName();
    int[] getTransactions();
    String createStatement();
}
