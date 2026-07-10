package src.prep.exercise4_2.configuration;

public class Configuration {

    /** The maximum allowed number of concurrent users. */
    public static final int MAX_USERS = 100;

    private final String systemName;

    Configuration(String name) {
        this.systemName = name;
    }

//   public void setSystemName(String name) {
//        this.systemName = name;               //java: cannot assign a value to final variable systemName
//    }
}
