package objectOrientedProgramming;

import objectOrientedProgramming.utilityClasses.Animal;
import objectOrientedProgramming.utilityClasses.Cat;
import objectOrientedProgramming.utilityClasses.Dog;
import objectOrientedProgramming.utilityClasses.Fish;

import java.util.Arrays;

public class Polymorphism {
    public static void main(String[] args) {
        // Polymorphism => "POLY" = "MANY"
        //                 "MORPH" = "SHAPE"
        //                  Objects can identify as other objects.
        //                  Objects can be treated as objects of a common superclass


        Animal[] race = {new Fish(), new Cat(), new Dog()};
        for(Animal animal : race) {
            System.out.println(animal.toString());
        }


    }
}
