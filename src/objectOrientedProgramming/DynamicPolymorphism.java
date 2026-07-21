package objectOrientedProgramming;

import objectOrientedProgramming.utilityClasses.*;

import java.util.Scanner;

public class DynamicPolymorphism {
    public static void main(String[] args) {
        // RUNTIME (DYNAMIC) POLYMORPHISM => When the method that gets executed is decided at runtime based on the actual type of the object.


        Scanner sc = new Scanner(System.in);
        ImaginaryAnimal animal;
        int choice;
        System.out.print("select pet: 1. cat or 2. dog ");
        choice = sc.nextInt();
        sc.nextLine();
        animal = switch(choice){
            case 1 -> new ImaginaryCat();
            case 2 -> new ImaginaryDog();
            default -> throw new IllegalStateException("Unexpected value: " + choice);
        };

        animal.speak();


    }
}
