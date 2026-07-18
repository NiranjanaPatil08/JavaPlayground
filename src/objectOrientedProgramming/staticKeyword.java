package objectOrientedProgramming;

import objectOrientedProgramming.utilityClasses.Friend;

public class staticKeyword {
    public static void main(String[] args) {
        // static => makes a variable or method belong to the class
        //           rather than to any specific object
        //           Commonly used for utility methods or shared resources

        Friend friend1 = new Friend("SpongeBob");
        System.out.println(friend1.name);
        System.out.println(Friend.numOfFriends);
        Friend friend2 = new Friend("SquarePants");
        System.out.println(friend2.name);
        System.out.println(Friend.numOfFriends);
        Friend friend3 = new Friend("Gary");
        System.out.println(friend3.name);
        System.out.println(Friend.numOfFriends);
        Friend.showFriends();
    }
}
