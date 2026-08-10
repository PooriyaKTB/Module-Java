package exercise4x;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Remainders {

    public void printRemainders(int divisor) {
        String result = IntStream.rangeClosed(1, 20)
                .map(i -> i % divisor)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(","));

        System.out.println(result);
    }

    public Map<Integer, List<Integer>> remainderGroups(int divisor) {
        return IntStream.rangeClosed(1, 20)
                .boxed()
                .collect(Collectors.groupingBy(i -> i % divisor));
    }

    public Map<Integer, Long> remainderCounts(int divisor) {
        return IntStream.rangeClosed(1, 20)
                .boxed()
                .collect(
                        Collectors.groupingBy(
                                i -> i % divisor,
                                Collectors.counting()
                        )
                );
    }
}
