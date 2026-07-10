package src.prep.exercise4_2.configuration;

public class Main {

    public static void main(String[] args) {

//        Configuration.MAX_USERS = 200; // java: cannot assign a value to final variable MAX_USERS

        Configuration config = new Configuration("config");

//        config.setSystemName("newSystemName"); // java: cannot assign a value to final variable systemName
    }
}

// Why can MAX_USERS never be reassigned?
// Because it is declared as a final field, so that its value can only be assigned once and Java does not allow it to be reassigned

// Why can the systemName field not be reassigned, even via a setter?
// Setter changes the value of field, but since systemName is declared as final, Java only allows it to be assigned once