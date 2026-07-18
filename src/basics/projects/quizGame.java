package basics.projects;

import java.util.Scanner;

public class quizGame {
    public static void main(String[] args) {

        String[] questions= {"What is main function of a router?",
                             "What is brain of comp?",
                             "Facebook launch year?",
                             "Father of computers?",
                             "First programming language?"};

        String[][] options = {{"1. storing files","2. encrypting data","3. directing internet traffic","4. managing passwords"},
                              {"1. CPU","2. hard drive", "3. RAM", "4. GPU" },
                              {"1. 2000","2. 2004", "3. 2006", "4. 2008" },
                              {"1. steve jobs","2. alan turing", "3. bill gates", "4. charles babbage" },
                              {"1. COBOL","2. C", "3. FORTRAN", "4. Assembly" }};

        int[]answers = {3,1, 2,4,3};
        int score = 0;
        int guess;
        Scanner sc = new Scanner(System.in);


        System.out.println("******************************");
        System.out.println("Welcome to the Java Quiz Game");
        System.out.println("******************************");


        for (int i=0;i<questions.length;i++){
            System.out.println(questions[i]);
            for (String option : options[i]){
                System.out.println(option);
            }
            System.out.print("Enter your choice: ");
            guess = sc.nextInt();
            sc.nextLine();
            if(guess== answers[i]){
                System.out.println("******************************");
                System.out.println("You guessed correctly!");
                System.out.println("******************************");
                score++;
            }
            else {
                System.out.println("******************************");
                System.out.println("Sorry, you guessed wrongly!");
                System.out.println("******************************");
            }


        }

        System.out.println("Your final score is "+score);


        sc.close();


    }
}
