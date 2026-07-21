package objectOrientedProgramming.utilityClasses;

import java.util.HashMap;

public class Animal extends Organism {

    Animal(){
        super();
    }

    public void eat(){
        System.out.println("The animal is eating");
    }
    public void move() {
        System.out.println("The animal is running");
    }

}
