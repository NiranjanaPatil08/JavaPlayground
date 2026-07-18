package basics.projects;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class slotMachine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int balance = 100;
        int bet ;
        int payout;
        String[] row;
        String playAgain;

        System.out.println("*********************************");
        System.out.println("Welcome to the slot machine");
        System.out.println("Symbols : '🍒 🍉 🍋 🌶️ 🍋‍🟩");
        System.out.println("*********************************");


        while(balance>0){
            System.out.println("Current balance is $"+balance);
            System.out.print("Place your be amount : ");
            bet = sc.nextInt();
            sc.nextLine();
            if(bet>balance){
                System.out.println("Insufficient balance");
                continue;
            }
            else if(bet<=0){
                System.out.println("Bet must be greater than 0.");
                continue;
            }
            else{
                balance-=bet;
            }
            System.out.println("Spinning...");
            row = spinRow();
            printRow(row);

            payout = getPayout(row,bet);
            if(payout>0){
                System.out.println("You won $"+payout  );
                balance+=payout;
                System.out.println("Current balance is $"+balance);
            }
            else {
                System.out.println("You lost ");
                System.out.println("Current balance is $"+balance);
            }

            System.out.print("Play again?(Y/N): ");
            playAgain = sc.nextLine().toUpperCase();

            if(!playAgain.equals("Y")){
                break;
            }


        }
        System.out.println("Thanks for playing");





        sc.close();
    }


    static String[] spinRow(){
        String[]symbols = {"🍒" ,"🍉", "🍋" ,"🌶️" ,"🍋‍🟩"};
        String[] row = new String[3];
        Random rand = new Random();

        for(int i=0;i<3;i++){
            row[i]=symbols[rand.nextInt(symbols.length)];
        }

        return row;
    }
    static void printRow(String[] row){
        System.out.println("*********************************");
        System.out.println(" "+String.join(" | ", row));
        System.out.println("*********************************");
    }
    static int getPayout(String[] row,int bet){
        if(row[0].equals(row[1]) && row[1].equals(row[2])){
            return bet*5;
        }
        else if(row[0].equals(row[1])){
            return bet*2;
        }
        else if(row[1].equals(row[2])){
            return bet*2;
        }
        return 0;

    }

}
