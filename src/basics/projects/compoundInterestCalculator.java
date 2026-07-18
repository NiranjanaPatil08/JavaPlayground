package basics.projects;
import java.util.Scanner;

public class compoundInterestCalculator {
    public static void main(String[] args) {

        double amt;
        int timesCompounded;
        int years;
        double rate;
        double ci;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter principal amount");
        amt = sc.nextDouble();
        System.out.println("enter times compounded per year");
        timesCompounded = sc.nextInt();
        System.out.println("enter no of years");
        years = sc.nextInt();
        System.out.println("enter rate (in %)");
        rate = sc.nextDouble()/100;

        ci = amt*Math.pow(1+rate/timesCompounded,timesCompounded*years);


        System.out.printf("Your final amount after %d years is %,.2f Rs.\n", years, ci);
        sc.close();

    }
}
