package src.prep;

public class Main {
    // Exercise 1.1
    static void main(String[] args){
        System.out.println("Hello, Java!");

    // Exercise 2.1
        int studentAge = 33;
        double courseRate = 4.8;
        boolean isAlive = true;
        char studentGrade = 'A';

        System.out.println("***Exercise 2.1***");
        System.out.println(studentAge);
        System.out.println(courseRate);
        System.out.println(isAlive);
        System.out.println(studentGrade);

        /*
          public: make our method accessible from other packages.
          static: make our method able to be run without instance creation needed.
          char: must be wrapped in single quotes '' , and must include only a character.
          void: telling that our method will not return anything.
         */

    // Exercise 2.2: Intentionally removed a semicolon to observe
    // IntelliJ's compilation error, then fixed it.

    // Exercise 2.3
        System.out.println("***Exercise 2.3***");
        for(int i=1; i<=10;i++){
            if(i%2==0){
                System.out.println(i +" Even");
            } else {
                System.out.println(i +" Odd");
            }
        }


        System.out.println("***Exercise 2.4***");
        Exercise2_4.weekDays(5);

        System.out.println("***Exercise 3.1***");
        System.out.println(greetUser("Pooriya"));

        System.out.println("***Exercise 3.2***");
        System.out.println(Exercise3_2.calculateSum(10,8));


        //Exercise 4.1
        System.out.println("***Exercise 4.1***");
        System.out.println(Exercise4_1.calculateOneToHundredSum());
    }

    // Exercise 3.1
    private static String greetUser(String name){
        return "Hello, " + name + "!";
    }
}
