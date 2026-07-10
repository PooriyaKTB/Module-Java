package src.prep.PaymentMethod;

public class DirectDebit extends PaymentMethod {

    @Override
    void pay(double amount) {
//        System.out.println(String.format("Paying %.2f as DirectDebit...", amount));
//        OR
        System.out.printf("Paying %.2f as DirectDebit...%n", amount);
//        OR
//        printMessage("Paying %.2f as DirectDebit...", amount, null);
    }
}