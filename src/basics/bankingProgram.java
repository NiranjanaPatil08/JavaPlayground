package basics;

import java.util.Scanner;

public class bankingProgram {
    public static void main(String[] args) {
        //  JAVA  BANKING PROGRAM


        // DECLARE VARIABLES
        Scanner sc = new Scanner(System.in);
        double balance=0;
        boolean isRunning = true;
        int choice;

        while(isRunning){
            System.out.println("********************************");
            System.out.println("Welcome to the banking program");
            System.out.println("********************************");
            System.out.println("1. Display balance\n2. Deposit\n3. Withdraw\n4. Exit");
            System.out.println("********************************");


            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1-> showBalance(balance);
                case 2-> {
                    balance = deposit(balance, sc);
                }
                case 3 -> {
                    balance = withdraw(balance , sc);
                }
                case 4-> isRunning = false;
                default -> System.out.println("Invalid choice");

            };


        }

        sc.close();
    }

    static void showBalance(double balance){
        System.out.printf("Your balance is %.2f\n\n",balance);

    }
    static double deposit(double balance, Scanner sc){
        System.out.println("Please enter the amount you want to deposit");
        double amount = sc.nextDouble();
        if (amount < 0){
            System.out.println("Invalid amount");
            return balance;
        }
        System.out.printf("Your balance after depositing %.2f is %.2f\n\n",amount,balance+amount);
        return balance+amount;

    }
    static double withdraw(double balance, Scanner sc){
        System.out.println("Please enter the amount you want to withdraw");
        double amount= sc.nextDouble();
        if(amount>balance || amount<0){
            System.out.println("Invalid amount");
            return balance;
        }
        System.out.printf("Your balance after withdrawing %.2f is %.2f\n\n",amount, balance-amount);
        return balance-amount;
    }


}
