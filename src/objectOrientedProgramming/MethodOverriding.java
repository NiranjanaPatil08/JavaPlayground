package objectOrientedProgramming;

import objectOrientedProgramming.utilityClasses.Cat;
import objectOrientedProgramming.utilityClasses.Dog;
import objectOrientedProgramming.utilityClasses.Fish;

public class MethodOverriding {
    public static void main(String[] args) {
        // Method Overriding => when subclass provides own implementation of a method already defined in parent class
        //                      allows for code reusability and give specific implementations.


        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();

        dog.move();
        cat.move();
        fish.move();

    }
}
