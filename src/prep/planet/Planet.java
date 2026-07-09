package src.prep.planet;

public class Planet {
    private String name;
    private static int planetCount = 0;

    Planet(String name) {
        this.name = name;
        planetCount++;
    }

    public static int getPlanetCount() {
        return planetCount;
    }
}
