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

        lastnameToGrade.put("Ketabi", 0);
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
/*
- Would it have been possible to use Arrays to model the same data?
- Yes, it would have been possible, but it would require more manual work

- Would it have been easier, harder or the same? Why?
- It would have been much harder because arrays have a fixed size and fewer built-in operations. Adding, removing, searching and updating data would require manually managing indexes. It could also lead to unexpected behavior if indexes are managed incorrectly

- What was your thought process when deciding which data structure was most appropriate for modelling particular data? What things did you consider?
- I considered what operations needed to perform on the data. Lists are useful when order and duplicates matter, Sets are useful when uniqueness is required (like storing distinct first or last name) and Maps are useful when we need to associate a key with a value (like storing full name and grade).

- Suppose the initial data set was input incorrectly and the same student’s name and grade was input twice. How would your Map<Student, Grade> handle this? Why?
- They would be treated as the same key because equals() and hashCode() define them as equal. The second value would replace the first value stored under that key.

- What is the difference between variables: a) List firstNames, b) List<String> firstNames, c) ArrayList<String> firstNames ? Which is preferable? Bonus: how about List<?> firstNames ?
- "List firstNames" is a raw type. It does not specify what type of data the List contains, so it should generally be avoided because it removes type safety.
- "List<String> firstNames" means we have a List that only stores Strings. This is usually preferred because it provides type safety and prevents adding incorrect types.
- "ArrayList<String> firstNames" means the variable is specifically an ArrayList. Although it works, it is usually less flexible because we are tied to one implementation.
  It is generally preferable to declare variables using the interface type and instantiate them with a concrete implementation, for example:
  List<String> firstNames = new ArrayList<>();
  This allows us to change the implementation later without changing the rest of the code.
- "List<?> firstNames" means a List of an unknown type. It can reference a List of any type, but because the type is unknown, we cannot safely add elements to it. It is mainly used when we only need to read data or work with a generic List.
 */
