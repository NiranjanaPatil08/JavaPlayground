package objectOrientedProgramming;

import objectOrientedProgramming.utilityClasses.Car;

public class arrayOfObjects {
    public static void main(String[] args) {
//        Car car1 = new Car("Mustang", "Red");
//        Car car2 = new Car("Corvette", "Blue");
//        Car car3 = new Car("Charger", "Green");
//
//        Car[] cars = {car1, car2, car3};

        Car[] cars = {new Car("Mustang", "Red"),new Car("Corvette", "Blue"),new Car("Charger", "Green")};
        for(Car car : cars){
            car.drive();
        }

        for(Car car : cars){
            car.color="black";
        }

        for(Car car : cars){
            car.drive();
        }
    }
}
