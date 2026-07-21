package objectOrientedProgramming.utilityClasses;

public class Dog extends Animal {
    public int lives = 1;

    public Dog() {
        super();
    }

    public void speak() {
        System.out.println("Woof");
    }
}
