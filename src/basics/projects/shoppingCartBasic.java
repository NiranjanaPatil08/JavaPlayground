package basics.projects;
import java.util.Scanner;

public class shoppingCartBasic {
    public static void main(String[] args) {
        double price;
        String item;
        int quantity;

        double total=0;

        Scanner sc = new Scanner(System.in);

        System.out.print("What item would you like to buy?: ");
        item = sc.next();
        System.out.print("What is the price for each?: ");
        price = sc.nextDouble();
        System.out.print("What quantity you wish to buy?: ");
        quantity = sc.nextInt();

        total = price*quantity;

        System.out.println("You have bought "+quantity+" "+item+"/s");
        System.out.println("Your total is "+total+" Rs.");




    }
}
