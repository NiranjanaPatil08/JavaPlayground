package basics.projects;

import java.util.Random;
import java.util.Scanner;

public class rockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String userChoice;
        String computerChoice;
        String[] options = {"Rock","Paper","Scissor"};

        boolean isPlaying = true;

        System.out.println("Welcome to the Rock Paper Scissor!");
        while(isPlaying){
            System.out.print("Enter your choice Rock Paper Scissor: ");
            userChoice = sc.nextLine();

            if(!userChoice.equalsIgnoreCase("Rock")
            && !userChoice.equalsIgnoreCase("Paper")
            && !userChoice.equalsIgnoreCase("Scissor")){
                System.out.println("Invalid choice. Try again!");
                continue;

            }

            computerChoice = options[rand.nextInt(3)];
            System.out.println("Computer choice: " + computerChoice);

            if(userChoice.equalsIgnoreCase(computerChoice)){
                System.out.println("It's a tie!");
            }
            else if((userChoice.equalsIgnoreCase("rock") && computerChoice.equalsIgnoreCase("scissor"))||
                    (userChoice.equalsIgnoreCase("paper") && computerChoice.equalsIgnoreCase("rock"))||
                    (userChoice.equalsIgnoreCase("scissor") && computerChoice.equalsIgnoreCase("paper"))){
                System.out.println("You win!");
            }
            else {
                System.out.println("You lost!");
            }

            System.out.println("Play again?(Y/N)");
            isPlaying= sc.next().equalsIgnoreCase("Y");
            sc.nextLine();
        }


        System.out.println("Thanks for playing!");
        sc.close();
    }
}
