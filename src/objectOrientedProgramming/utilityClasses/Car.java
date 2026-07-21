package objectOrientedProgramming.utilityClasses;

public class Car {
    public String model;
    public String color;
    public String make;
    public int year;
    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }
    public Car(String make, String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.make = make;
    }

    public void drive() {
        System.out.println("Driving "+this.color+" "+this.model);
    }

    @Override
    public String toString() {
        return this.model+" "+this.make+" "+this.color+" "+this.year;

    }

    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }
}
