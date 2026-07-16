package basics;

import java.util.Scanner;

public class stringMethods {
    public static void main(String[] args) {

        /*
        String name= "  Password  ";
        String name= "  Niranjana Patil  ";

        name= name.trim();
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.indexOf('a'));
        System.out.println(name.lastIndexOf('a'));
        System.out.println(name.replace("a", "x"));

        System.out.println(name.isEmpty());
        System.out.println(name.contains(" "));

//        name = name.toLowerCase();
//        System.out.println(name);
//        name = name.toUpperCase();
//        System.out.println(name);

        if(name.equalsIgnoreCase("password")){
            // .equals method is case sensitive
            System.out.println("your name can't be password");
        }
        else System.out.println("hello "+name);


         */

        // SUBSTRING METHOD
        // .substring(start, end) => method to extract a portion of a string
        String email;
        String username;
        String domain;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email: ");
        email = sc.nextLine();
        if(email.contains("@")){
//            username = email.substring(0,email.indexOf("@"));
//            domain = email.substring(email.indexOf("@")+1);

            username = email.split("@")[0];
            domain = email.split("@")[1];

            System.out.println("Username: "+username+" Domain: "+domain);
        }
        else System.out.println("Invalid Email");



    }

}
