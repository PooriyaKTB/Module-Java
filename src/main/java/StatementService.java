public class StatementService {

    StatementDeliveryService deliveryService = new StatementDeliveryService();

    void createAllTransactionStatement(StatementSender sender){
        Statement allTransactions = new AllTransactionsMonthlyStatement();
         deliveryService.deliverStatement(allTransactions,sender);
    }
    void createOutgoingTransactionStatement(StatementSender sender){
        Statement outgoingTransactions = new OutgoingTransactionsMonthlyStatement();
         deliveryService.deliverStatement(outgoingTransactions,sender);
    }
}
