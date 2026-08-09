package exercise1x;

/**
 * Sends bank statements by email.
 */
public class EmailStatementSender implements StatementSender {

    @Override
    public void sendStatement(String statementContent) {

        System.out.println(statementContent + " sent via Email");
    }

    @Override
    public void sendStatement(Statement statement){
        System.out.println(statement.createStatement() + " Email");
    }
}
