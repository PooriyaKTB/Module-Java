package src.prep;

public class Exercise2_4 {
    public static void weekDays(int num){
        switch (num) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Please enter a integer from 1 to 7");
        }
    }
}

// JavaScript allows any data type into a switch statement because it is dynamically typed, though it uses strict equality (===) to match cases at runtime. Java is statically typed, so the compiler enforces that a switch statement only accepts specific, valid data types before the program is even allowed to run!