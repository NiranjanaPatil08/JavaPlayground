package objectOrientedProgramming.utilityClasses;

public class CompositionCar {
    public String model;
    public int year;
    public Engine engine;

    public CompositionCar(String model, int year, String engineType) {
        this.engine = new Engine(engineType);
        this.model = model;
        this.year = year;
    }

    public void start(){
        this.engine.start();
        System.out.println("the "+ this.model +" is running");
    }
}
