package exersice2x;

import java.util.*;

public class StudentsGrades {

    private String[] firstNameArr;
    private String[] lastNameArr;
    private int[] gradeArr;

     public StudentsGrades(String[] firstNames, String[] lastNames, int[] grades) {
        this.firstNameArr = firstNames;
        this.lastNameArr = lastNames;
        this.gradeArr = grades;
    }

    public List<String> getFirstNames(String[] firstNames, String[] lastNames, int[] grades) {
        return new ArrayList<>(List.of(firstNames));
//        return new ArrayList<>(Arrays.asList(firstNames));
    }

    public Set<String> getDistinctFirstNames(String[] firstNames, String[] lastNames, int[] grades) {
        return new HashSet<>(List.of(firstNames));
    }

    public Set<String> getDistinctFirstNamesInAlphabeticalOrder(String[] firstNames, String[] lastNames, int[] grades) {
        return new TreeSet<>(List.of(firstNames));
    }

    public Map<String, Integer> getLastNameToGrade(String[] firstNames, String[] lastNames, int[] grades) {
        Map<String, Integer> lastNamesGrades = new HashMap<>();
        for (int i = 0; i < lastNames.length; i++) {
            lastNamesGrades.put(lastNames[i], grades[i]);
        }
        return lastNamesGrades;
    }

    @Override
    public String toString() {
        return String.format("FirstName: %s,%nLastName: %s,%nGrade: %s", Arrays.toString(firstNameArr), Arrays.toString(lastNameArr), Arrays.toString(gradeArr));
    }
}

/*
We can use the class variables for methods, but I tought there is a reason we asked for using paramteres in methods!
 */