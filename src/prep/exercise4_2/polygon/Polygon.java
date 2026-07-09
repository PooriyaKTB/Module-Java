package src.prep.exercise4_2.polygon;

public class Polygon {
    private final int numberOfSides;

    Polygon(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public int getNumberOfSides() {
        return this.numberOfSides;
    }

    public final void describe() {
        System.out.printf("I am a polygon with %d sides.", this.numberOfSides);
    }

//    public void setNumberOfSides(int newNumberOfSides) {
//        this.numberOfSides = newNumberOfSides;            //java: cannot assign a value to final variable numberOfSides
//    }
}
