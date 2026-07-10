package src.prep.PaymentMethod;

/**
 * Manages the checkout process by delegating payments to a specified method.
 */
public class Checkout {

    private PaymentMethod payment;

    public Checkout() {
        this.payment = new PaymentMethod();
    }

    /**
     * Updates the payment strategy used for this checkout.
     * @param paymentMethod the new payment strategy to use
     */
    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.payment = paymentMethod;
    }

    /**
     * Processes a payment of the specified amount.
     * @param amount the amount to be paid
     */
    public void processPayment(double amount) {
        payment.pay(amount);
    }
}
