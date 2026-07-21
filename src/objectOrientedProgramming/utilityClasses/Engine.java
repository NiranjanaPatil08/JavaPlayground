package objectOrientedProgramming.utilityClasses;

public class Engine {

    public String type;

    public Engine(String type){
        this.type=type;
    }
    public void start(){
        System.out.println("Starting Engine");
    }
}
