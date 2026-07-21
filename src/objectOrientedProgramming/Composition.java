package objectOrientedProgramming;

import objectOrientedProgramming.utilityClasses.CompositionCar;

public class Composition {
    public static void main(String[] args) {

        // COMPOSITION => Represents a "part-of" relationship between objects.
        //                e.g. engine is part of a car
        //                Allows complex objects to be constructed from smaller objects.

        //                if we delete the car object, we also delete the engine.. engine cannot exist without car;

        CompositionCar car = new CompositionCar("corvette", 2025, "v8" );
        System.out.println(car.model);
        System.out.println(car.year );
        System.out.println(car.engine.type);

        car.start();



    }
}
