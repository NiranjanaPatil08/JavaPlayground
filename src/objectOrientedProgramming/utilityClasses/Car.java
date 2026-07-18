package objectOrientedProgramming.utilityClasses;

public class Car {
    public String model;
    public String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public void drive() {
        System.out.println("Driving "+this.color+" "+this.model);
    }
}
