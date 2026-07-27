import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * A fake class implementing the interface just for test purpose
 * instead of doing any job, it simply makes us able to ensure the method is called!
 */
class DummyStatementSender implements StatementSender{

    public boolean isCalled = false;

    @Override
    public void sendStatement(String statementContent) {
        isCalled = true;
    }
}

public class TestStatementSender {

    StatementDeliveryService deliveryService = new StatementDeliveryService();
    DummyStatementSender fakeStatementSender = new DummyStatementSender();

    @Test
    @DisplayName("Testing the method calling")
    void testDeliveryInstance(){
        deliveryService.deliverStatement("test", fakeStatementSender);
        Assertions.assertTrue(fakeStatementSender.isCalled);
    }
}
