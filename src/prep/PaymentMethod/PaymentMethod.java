package src.prep.PaymentMethod;

/**
 * Represents a payment processing interface.
 */
public class PaymentMethod {

    /**
     * Processes payment in the default currency.
     * @param amount the amount to pay
     */
    void pay(double amount) {
        System.out.println("Paying " + amount + "...");
    }

    /**
     * Processes payment in the specified currency.
     * @param amount   the amount to pay
     * @param currency the currency eg. £, $, GBP, USD, EUR
     */
    void pay(double amount, String currency) {
//        System.out.println(String.format("Paying %.2f%s...", amount, currency));
//        OR
        System.out.printf("Paying %.2f%s...%n", amount, currency);
//        OR
//        printMessage("Paying %.2f%s....", amount, currency);
    }

//    public void printMessage(String message, double amount, String currency) {
//        System.out.println(String.format(message, amount, currency));
//    }
}

// *** IntelliJ showed the following warning :
// Warning:(9, 35) Redundant call to 'format()'
// so that I used da different formatting approach.
// Is it an appropriate way to resolve the warning?
// I know I could even create a helper method like printMessage() and overload it,
// But I was not sure which approach would be a better.