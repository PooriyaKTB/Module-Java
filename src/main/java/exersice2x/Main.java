package exersice2x;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        String[] firstNames = {"Anuket", "Eryn", "Filip", "Raquel", "Eryn"};
        String[] lastNames = {"Hassan", "Doe", "Doe", "Clarke", "Jones"};
        int[] grades = {22, 45, 35, 22, 41};

        StudentsGrades studentsGrades = new StudentsGrades(firstNames, lastNames, grades);

        System.out.println("** StudentGrades:");
        System.out.println(studentsGrades);

        System.out.println("** getFirstNames: " + studentsGrades.getFirstNames(firstNames, lastNames, grades));
        System.out.println("** getDistinctFirstNames: " + studentsGrades.getDistinctFirstNames(firstNames, lastNames, grades));
        System.out.println("** getDistinctFirstNamesInAlphabeticalOrder: " + studentsGrades.getDistinctFirstNamesInAlphabeticalOrder(firstNames, lastNames, grades));
        System.out.println("** getLastNameToGrade: " + studentsGrades.getLastNameToGrade(firstNames, lastNames, grades));

        System.out.println("** getStudentToGrade: " + studentsGrades.getStudentToGrade());

        //*** Exercise 2.3 ***
        List<String> firstNamesList = studentsGrades.getFirstNames(firstNames, lastNames, grades);
        Set<String> distinctFirstNames = studentsGrades.getDistinctFirstNames(firstNames, lastNames, grades);
        Set<String> distinctFirstNamesInOrder = studentsGrades.getDistinctFirstNamesInAlphabeticalOrder(firstNames, lastNames, grades);
        Map<String, Integer> lastnameToGrade = studentsGrades.getLastNameToGrade(firstNames, lastNames, grades);
        Map<Student, Integer> studentToGrade = studentsGrades.getStudentToGrade();

        System.out.println("firstNamesList: " + firstNamesList);
        System.out.println("distinctFirstNames: " + distinctFirstNames);
        System.out.println("distinctFirstNamesInOrder: " + distinctFirstNamesInOrder);
        System.out.println("lastnameToGrade: " + lastnameToGrade);
        System.out.println("studentToGrade: " + studentToGrade);

        System.out.println("*** Pooriya added *** ");

        firstNamesList.add("Pooriya");
        distinctFirstNames.add("Pooriya");
        distinctFirstNamesInOrder.add("Pooriya");
        lastnameToGrade.put("Ketabi", 39);
        studentToGrade.put(new Student("Pooriya", "Ketabi"), 39);

        System.out.println("firstNamesList: " + firstNamesList);
        System.out.println("distinctFirstNames: " + distinctFirstNames);
        System.out.println("distinctFirstNamesInOrder: " + distinctFirstNamesInOrder);
        System.out.println("lastnameToGrade: " + lastnameToGrade);
        System.out.println("studentToGrade: " + studentToGrade);

        System.out.println("*** Pooriya cheated ***");

        lastnameToGrade.put("Ketabi",0);
        studentToGrade.put(new Student("Pooriya", "Ketabi"), 0);

        System.out.println("firstNamesList: " + firstNamesList);
        System.out.println("distinctFirstNames: " + distinctFirstNames);
        System.out.println("distinctFirstNamesInOrder: " + distinctFirstNamesInOrder);
        System.out.println("lastnameToGrade: " + lastnameToGrade);
        System.out.println("studentToGrade: " + studentToGrade);

        System.out.println("*** Pooriya left ***");
        firstNamesList.remove("Pooriya");
        distinctFirstNames.remove("Pooriya");
        distinctFirstNamesInOrder.remove("Pooriya");
        lastnameToGrade.remove("Ketabi");
        studentToGrade.remove(new Student("Pooriya", "Ketabi"));

        System.out.println("firstNamesList: " + firstNamesList);
        System.out.println("distinctFirstNames: " + distinctFirstNames);
        System.out.println("distinctFirstNamesInOrder: " + distinctFirstNamesInOrder);
        System.out.println("lastnameToGrade: " + lastnameToGrade);
        System.out.println("studentToGrade: " + studentToGrade);
    }
}
