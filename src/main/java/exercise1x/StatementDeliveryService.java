package exercise1x;

/**
 * Delivers bank statements using a StatementSender.
 */
public class StatementDeliveryService {

    /**
     * Delivers statement content using the given sender.
     *
     * @param statementContent the content of the statement
     * @param statementSender the sender used to deliver the statement
     */
    public void deliverStatement(String statementContent, StatementSender statementSender) {
        statementSender.sendStatement(statementContent);
    }

    /**
     * Delivers a statement using the given sender.
     *
     * @param statement the statement to deliver
     * @param statementSender the sender used to deliver the statement
     */
    public void deliverStatement(Statement statement, StatementSender statementSender) {
        statementSender.sendStatement(statement);
    }
}
