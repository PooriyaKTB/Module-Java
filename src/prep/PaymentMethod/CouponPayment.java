package src.prep.PaymentMethod;

// Exercise 3.3 stretch task:
public class CouponPayment extends PaymentMethod {

    @Override
    void pay(double amount) {
        System.out.printf("Paying %.2f via Coupon...%n", amount);
    }
}
