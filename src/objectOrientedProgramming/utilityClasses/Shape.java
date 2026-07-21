package objectOrientedProgramming.utilityClasses;

public abstract class Shape {

    abstract public double area();  // ABSTRACT METHOD
    public void display(){ //  CONCRETE METHOD
        System.out.println("This is a shape");
    }
}
