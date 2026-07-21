package objectOrientedProgramming;

import objectOrientedProgramming.utilityClasses.Car;

public class GettersAndSetters {
    public static void main(String[] args) {

        // They help protect object data and add rules for accessing or modifying them
        // GETTERS = methods that make a field READABLE
        // SETTERS = methods that make a field WRITEABLE


        // In the Car class, declare attributes as private and then make getters and setters for them
        // so that the attributes can't be accessed outside car class with car.color etc
        Car car = new Car("Ford", "red");
        System.out.println(car.getColor());
        car.setColor("blue");
        System.out.println(car.getColor());
    }
}
