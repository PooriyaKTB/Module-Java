package exercise2x;

import java.util.*;

/**
 * Provides operations for working with student names and grades.
 */
public class StudentsGrades {

    private String[] firstNameArr;
    private String[] lastNameArr;
    private int[] gradeArr;

    public StudentsGrades(String[] firstNames, String[] lastNames, int[] grades) {
        this.firstNameArr = firstNames;
        this.lastNameArr = lastNames;
        this.gradeArr = grades;
    }

    /**
     * Returns all first names as a list.
     *
     * @param firstNames the first names of the students
     * @param lastNames the last names of the students
     * @param grades the grades of the students
     * @return a list containing all first names
     */
    public List<String> getFirstNames(String[] firstNames, String[] lastNames, int[] grades) {
        return new ArrayList<>(List.of(firstNames));
//        return new ArrayList<>(Arrays.asList(firstNames));
    }

    /**
     * Returns the distinct first names.
     *
     * @param firstNames the first names of the students
     * @param lastNames the last names of the students
     * @param grades the grades of the students
     * @return a set containing distinct first names
     */
    public Set<String> getDistinctFirstNames(String[] firstNames, String[] lastNames, int[] grades) {
        return new HashSet<>(List.of(firstNames));
    }

    /**
     * Returns the distinct first names in alphabetical order.
     *
     * @param firstNames the first names of the students
     * @param lastNames the last names of the students
     * @param grades the grades of the students
     * @return a set containing distinct first names in alphabetical order
     */
    public Set<String> getDistinctFirstNamesInAlphabeticalOrder(String[] firstNames, String[] lastNames, int[] grades) {
        return new TreeSet<>(List.of(firstNames));
    }

    /**
     * Maps each last name to its grade.
     *
     * @param firstNames the first names of the students
     * @param lastNames the last names of the students
     * @param grades the grades of the students
     * @return a map containing last names and their grades
     */
    public Map<String, Integer> getLastNameToGrade(String[] firstNames, String[] lastNames, int[] grades) {
        Map<String, Integer> lastNamesGrades = new HashMap<>();
        for (int i = 0; i < lastNames.length; i++) {
            lastNamesGrades.put(lastNames[i], grades[i]);
        }
        return lastNamesGrades;
    }

    /**
     * Maps each student to their grade.
     *
     * @return a map containing students and their grades
     */
    public Map<Student, Integer> getStudentToGrade() {
        Map<Student, Integer> studentGrade = new HashMap<>();
        for (int i = 0; i < firstNameArr.length; i++) {
            studentGrade.put(new Student(firstNameArr[i], lastNameArr[i]), gradeArr[i]);
        }
        return studentGrade;
    }

    @Override
    public String toString() {
        return String.format("FirstName: %s,%nLastName: %s,%nGrade: %s", Arrays.toString(firstNameArr), Arrays.toString(lastNameArr), Arrays.toString(gradeArr));
    }
}

/*
We can use the class variables for methods, but I tought there is a reason we asked for using paramteres in methods!
 */