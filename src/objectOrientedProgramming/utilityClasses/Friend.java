package objectOrientedProgramming.utilityClasses;

public class Friend {
    public String name;
    public static int numOfFriends;


    public Friend(String name) {
        this.name = name;
        numOfFriends++;
    }

    public static void showFriends(){
        System.out.println("you have " + numOfFriends + " friends");
    }


}
