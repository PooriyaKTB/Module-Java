package exercise1x;

/**
 * Sends bank statements by letter.
 */
public class LetterStatementSender implements StatementSender {

    @Override
    public void sendStatement(String statementContent) {

        System.out.println(statementContent + " sent via Letter");
    }

    @Override
    public void sendStatement(Statement statement){
        System.out.println(statement.createStatement() + " letter");
    }
}
