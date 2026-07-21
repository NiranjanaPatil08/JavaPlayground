package objectOrientedProgramming;

import objectOrientedProgramming.utilityClasses.Fishes;
import objectOrientedProgramming.utilityClasses.Hawk;
import objectOrientedProgramming.utilityClasses.Rabbit;

public class Interface {
    public static void main(String[] args) {
        // Interface => a blueprint for a class that specifies a set of abstract methods
        //              that implementing classes MUST define.
        //              supports multiple inheritance-like behavior (multiple parents)

        Rabbit r = new Rabbit();
        r.flee();

        Hawk h = new Hawk();
        h.hunt();

        Fishes f = new Fishes();
        f.flee();
        f.hunt();
    }
}
