package exercise4x;

import java.util.Map;

public class ShapeCounter {

    public long countShapesWithSides(Map<String, Integer> shapesToSides, int sides) {
        return shapesToSides.values().stream()
                .filter(s -> s == sides)
                .count();
    }
}