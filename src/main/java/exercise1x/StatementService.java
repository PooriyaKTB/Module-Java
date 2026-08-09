package exercise1x;

public class StatementService {

    /**
     * Creates and delivers different types of bank statements.
     */
    StatementDeliveryService deliveryService = new StatementDeliveryService();

    /**
     * Creates and delivers a statement containing all transactions.
     *
     * @param sender the sender used to deliver the statement
     */
    void createAllTransactionStatement(StatementSender sender){
        Statement allTransactions = new AllTransactionsMonthlyStatement();
         deliveryService.deliverStatement(allTransactions,sender);
    }

    /**
     * Creates and delivers a statement containing outgoing transactions.
     *
     * @param sender the sender used to deliver the statement
     */
    void createOutgoingTransactionStatement(StatementSender sender){
        Statement outgoingTransactions = new OutgoingTransactionsMonthlyStatement();
         deliveryService.deliverStatement(outgoingTransactions,sender);
    }
}
