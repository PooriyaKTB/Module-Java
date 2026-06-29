package src.backlog;

public class Main {
    public static void main(String[] args) {
        printPrimeNum(1000);
    }

    /**
     * @param limitWithin The limit that we want to check for primes within
     */
    private static void printPrimeNum(int limitWithin){
        for(int i=2; i<=limitWithin; i++){
            if (PrimeChecker.isPrimeNumber(i)){
                System.out.print(i + " ");
            }
        }
    }
}
