package src.prep.PaymentMethod;

public class Checkout {
    private PaymentMethod payment;

    public Checkout() {
        this.payment = new PaymentMethod();
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.payment = paymentMethod;
    }

    public void processPayment(double amount) {
        payment.pay(amount);
    }
}
