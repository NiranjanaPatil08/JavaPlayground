package basics.projects;
import java.util.Scanner;

public class madLIBs {
    public static void main(String[] args) {
        // MAD LIBS GAME
        String adj1;
        String adj2;
        String adj3;
        String noun1;
        String verb;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter an adjective");
        adj1= sc.nextLine();
        System.out.println("enter an adjective");
        adj2 = sc.nextLine();
        System.out.println("enter an adjective");
        adj3 = sc.nextLine();
        System.out.println("enter a noun");
        noun1 = sc.nextLine();
        System.out.println("enter a verb");
        verb = sc.nextLine();

        System.out.println("\nToday I went to a "+adj1 +" zoo.");
        System.out.println("In an exhibit I saw a "+noun1+".");
        System.out.println(noun1 +" was "+adj2 + " and "+verb+"!");
        System.out.println("I was "+adj3+"!");

        sc.close();
    }
}
