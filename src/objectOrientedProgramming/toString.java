package objectOrientedProgramming;

import objectOrientedProgramming.utilityClasses.Car;

public class toString {
    public static void main(String[] args) {
        // .toString() => Method inherited from Object class
        //                Used to return a string representation of an object
        //                By default, it returns a hash code as a unique identifier.
        //                It can be overridden to provide meaningful details
        //                Arrays.toString() is an overridden method by Arrays class

        Car car = new Car("Mustang", "Ford", "Red", 2025);
        System.out.println(car);
        System.out.println(car.toString());
    }
}
