package basics;

import java.util.Scanner;

public class enhancedSwitch {
    public static void main(String[] args) {
        // ENHANCED SWITCHES => Java 14 feature
        // comparison with traditional switch case:
        // syntax of traditional switch in java -> same as cpp
        // In enhanced switch, no break statement req here
        // switch can return a value
        // you can write multiple cases in front of single case label by separating them using comma which was not allowed in traditional syntax or cpp.
        // traditional was to leave the case blank so that it can fall through to the next case and so you can group similar cases by leaving them blank and
        // writing code only for the last case of the similar cases group;


        Scanner sc = new Scanner(System.in);
        System.out.println("enter day");
        String day = sc.nextLine();

        String result = switch(day.trim()){
            case "Monday","Tuesday","Wednesday","Thursday","Friday"->"Weekday";
            case "Saturday","Sunday"->"Weekend";
            default -> "Invalid day";
        };
        System.out.println(result);

        sc.close();
    }

}
