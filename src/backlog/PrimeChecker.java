package src.backlog;

public class PrimeChecker {
    /**
     * @param number the number that we want to check if is prime
     * @return whether the argument is prime (true) or not (false)
     */
    static boolean isPrimeNumber(int number) {
        if (number <= 1) return false;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }

        return true;
    }
}
