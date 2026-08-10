package exercise4x;

import java.util.*;
import java.util.stream.Collectors;

public class NameFinder {

    public void printNamesStartingWithA(Collection<String> names) {
        names.stream()
                .filter(name -> name.toLowerCase().startsWith("a"))
                .forEach(System.out::println);
    }

    public List<String> vowelNamesCapitalisedDescending(Collection<String> names) {
        return names.stream()
                .filter(name -> name.matches("(?i)^[aeiou].*"))
                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
                .sorted((a, b) -> b.compareTo(a))
//                .sorted(Comparator.reverseOrder())
                .toList();
    }
}