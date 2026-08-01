package exersice2x;

public class Main {
    public static void main(String[] args) {

        String[] firstNames = {"Anuket", "Eryn", "Filip", "Raquel", "Eryn"};
        String[] lastNames = {"Hassan", "Doe", "Pappas", "Clarke", "Jones"};
        int[] grades = {22, 45, 35, 22, 41};

        StudentsGrades studentsGrades = new StudentsGrades(firstNames, lastNames, grades);

        System.out.println("** StudentGrades:");
        System.out.println(studentsGrades);

        System.out.println("** getFirstNames: " + studentsGrades.getFirstNames(firstNames, lastNames, grades));
        System.out.println("** getDistinctFirstNames: " + studentsGrades.getDistinctFirstNames(firstNames, lastNames, grades));
        System.out.println("** getDistinctFirstNamesInAlphabeticalOrder: " + studentsGrades.getDistinctFirstNamesInAlphabeticalOrder(firstNames, lastNames, grades));
        System.out.println("** getLastNameToGrade: " + studentsGrades.getLastNameToGrade(firstNames, lastNames, grades));

        System.out.println("** getStudentToGrade: " + studentsGrades.getStudentToGrade());
    }
}
