package objectOrientedProgramming.utilityClasses;

public class Fishes implements Prey,Predator{
    @Override
    public void hunt() {
        System.out.println("Fish hunting smaller fish");
    }

    @Override
    public void flee() {
        System.out.println("Fish fleeing from bigger fish");
    }
}
