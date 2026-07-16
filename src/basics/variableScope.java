package basics;

public class variableScope {
    // CLASS VARIABLE -> static keyword, accessible by all methods of class
    static int x=3;
    public static void main(String[] args) {
        // LOCAL VARIABLE -> scope only in method, not accessible outside method unless passed as an argument
        int x = 1;
        System.out.println(x);
        // will print 1 as priority to local variable inside the method
        doSomething();

    }
    public static void doSomething(){
        int x = 2;
        System.out.println(x);
    }
}
