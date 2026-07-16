package basics;
import java.util.Scanner;

public class userInput {
        public static void main(String[] args) {


//                Scanner sc = new Scanner(System.in);
//                System.out.print("enter your name: ");
//                String name = sc.nextLine();
//
//                System.out.print("enter your age: ");
//                int age = sc.nextInt();
//
//                System.out.println("hello "+ name+" of "+age+" years old");
//
//                sc.close();

                // scanner methods
//                sc.next();
//                sc.nextLine();
//                sc.nextDouble();
//                sc.nextBoolean();


                // Common Issues:
                Scanner sc2 = new Scanner(System.in);
                System.out.print("enter age: ");
                int age2 = sc2.nextInt();
                // clear input buffer as the \n char is stored in it when we click enter after inputting an int
                sc2.nextLine();
                System.out.print("enter fav color: ");
                String color = sc2.nextLine();
                System.out.println("age: "+age2+" color: "+color);



                double rectArea= calculateArea(sc2);
                System.out.println("rectArea: "+rectArea);
                sc2.close();
        }

        public static double calculateArea(Scanner sc){
                double area = 0;

                System.out.println("enter width , height: ");
                double width = sc.nextDouble();
                double height = sc.nextDouble();
                area = width* height;
                return area;

        }

}
