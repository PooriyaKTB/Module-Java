package exercise2x.exercise2_1;

import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<Cog> cogs = Set.of(new Cog(), new Cog(), new Cog());
        Cambelt cambelt = new Cambelt();
        Gears gears = new Gears(cogs);
        Engine engine = new Engine(gears, cambelt);
        Car car = new Car(engine);

        car.start();
    }

    static class Car {
        private final Engine engine;

        public Car(Engine engine) {
            this.engine = engine;
        }

        void start() {
            engine.rev();
            System.out.println("Car Started");
        }

    }


    static class Engine {
        private final Gears gears;
        private final Cambelt cambelt;

        public Engine(Gears gears, Cambelt cambelt) {
            this.gears = gears;
            this.cambelt = cambelt;
        }

        void rev() {
            gears.initialise();
            cambelt.initialise();
        }
    }


    static class Gears {
        private final Set<Cog> cogs;

        public Gears(Set<Cog> cogs) {
            this.cogs = cogs;
        }

        void initialise() {
            cogs.forEach(cog -> cog.spin());

            // Initialisation logic
        }
    }

    static class Cog {
        void spin() {
            // Spin logic
        }
    }


    static class Cambelt {
        void initialise() {
            // Initialisation logic
        }
    }

}
