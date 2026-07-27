public class LetterStatementSender implements StatementSender {

    @Override
    public void sendStatement(String statementContent) {

        System.out.println(statementContent + " sent via Letter");
    }
}
