package src.prep;

public class Exercise4_1 {
    public static int calculateOneToHundredSum(){
        int sum = 0;
        for (int i=1; i<=100; i++){
            sum+=i;
        }

//        OR:

//         int n = 100;
//         int sum = n * (n + 1) / 2;

        return sum;
    }
}
