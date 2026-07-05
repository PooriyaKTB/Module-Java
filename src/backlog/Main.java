package src.backlog;

public class Main {
    public static void main(String[] args) {
        int result = reverseNumber(3956);

        System.out.println(result);
    }

    /**
     * This method Reverses the given integer.
     * @param number the integer to be reversed
     * @return the reversed integer
     */
    private static int reverseNumber(int number) {
        int reversedNumber = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            number /= 10;
        }

        return reversedNumber;
    }
}
