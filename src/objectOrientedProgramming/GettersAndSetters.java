package objectOrientedProgramming;

import objectOrientedProgramming.utilityClasses.Car;

public class GettersAndSetters {
    public static void main(String[] args) {

        // They help protect object data and add rules for accessing or modifying them
        // GETTERS = methods that make a field READABLE
        // SETTERS = methods that make a field WRITEABLE

        Car car = new Car("Ford", "red");
        System.out.println(car.getColor());
        car.setColor("blue");
        System.out.println(car.getColor());
    }
}
