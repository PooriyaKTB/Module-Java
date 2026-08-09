package exercise1x;

/**
 * Represents a monthly statement containing outgoing transactions.
 */
public class OutgoingTransactionsMonthlyStatement implements Statement{

    @Override
    public String getPeriod() {
        return "Period Placeholder";
    }

    @Override
    public int getAccountNumber() {
        return 0;
    }

    @Override
    public String getCustomerName() {
        return "CustomerName Placeholder";
    }

    @Override
    public int[] getTransactions() {
        return new int[0];
    }

    @Override
    public String createStatement() {
        return "Outgoing Transactions...";
    }
}
