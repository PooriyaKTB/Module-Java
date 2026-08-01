package exercise1x;

public class StatementDeliveryService {

    public void deliverStatement(String statementContent, StatementSender statementSender) {
        statementSender.sendStatement(statementContent);
    }

    public void deliverStatement(Statement statement, StatementSender statementSender) {
        statementSender.sendStatement(statement);
    }
}
