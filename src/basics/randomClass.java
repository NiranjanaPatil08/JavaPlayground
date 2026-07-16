package basics;
import java.util.Random;

public class randomClass {
    public static void main(String args[]) {
        Random rand = new Random();
        int num ;

        num = rand.nextInt(1,7);
        System.out.println(num);

        System.out.println(rand.nextBoolean()? "Heads": "Tails");


    }
}
