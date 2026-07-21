package objectOrientedProgramming;

public class constructors {
    public static void main(String[] args) {
        // Object => an entity that holds data(attributes)
        //           and can perform actions (methods)
        //           it is a reference data type

        // Class => a blueprint for creating objects

        // Constructors => A special method to initialize objects
        //                 You can pass args to a constructor and setup initial values

        // Overloaded Constructors => allow a class to have multiple constructors with diff parameter lists

        // Super => refers to parent class (superclass)
        //          used in constructors and method overriding ( calls parent constructor to initialize attributes


        // EXAMPLES:
        // Student(String name, int age, double gpa){
        // this.name = name;
        // this.age = age;
        // this.gpa = gpa;
        // }

        // EXAMPLES:
        // Student(){
        // this.username  = "guest";
        // this.email  = "not provided";
        // this.age = 0;
        // }
        // Student(String username){
        // this.username  = username;
        // this.email  = "Not provided";
        // this.age = 0;
        // }
        // Student(String username, String email){
        // this.username  = username;
        // this.email  = email;
        // this.age = 0;
        // }
        // Student(String username, String email, int age){
        // this.username  = username;
        // this.email  = email;
        // this.age = age;
        // }
    }
}