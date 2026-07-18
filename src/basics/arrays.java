package basics;

import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
//        String[] fruits = new String[3];
//        String[] colors = {"yellow", "red", "green", "blue"};
//        System.out.println(Arrays.toString(fruits));
//        System.out.println(fruits);
//        fruits[0] = "apple";
//        System.out.println(fruits[0]);
//
//        System.out.println(fruits.length);
//        fruits[1] = "pineapple";
//        fruits[2] = "orange";
//
//        Arrays.sort(fruits);
//
//        // ENHANCED FOR LOOP (OR FOR EACH LOOP)
//        for (String fruit : fruits) {
//            System.out.println(fruit);
//        }
//
//        Arrays.fill(fruits, colors[0]);
//        for (String fruit : fruits) {
//            System.out.println(fruit);
//        }


        // USER INPUT IN ARRAY

        Scanner sc = new Scanner(System.in);
        int size;
        String[] food;
        System.out.println("Enter the size of the array:");
        size = sc.nextInt();
        sc.nextLine();
        food = new String[size];
        System.out.println("Enter the food array:");

        for(int i =0; i<size;i++){
            food[i] = sc.nextLine();
        }
        for(String foods: food){
            System.out.println(foods);
        }


        sc.close();
    }
}
