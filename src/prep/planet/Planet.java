package src.prep.planet;

/**
 * Represents a planet in a solar system.
 * Keeps track of the total number of planets created.
 */
public class Planet {

    private String name;
    private static int planetCount = 0;

    /**
     * Initializes a new planet and increments the global count.
     * @param name the name of the planet
     */
    Planet(String name) {
        this.name = name;
        planetCount++;
    }

    /**
     * Returns the total number of Planet instances created.
     * @return the total planet count
     */
    public static int getPlanetCount() {
        return planetCount;
    }
}
