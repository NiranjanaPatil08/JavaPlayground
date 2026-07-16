package basics;

public class operators {
    public static void main(String[] args) {
        int x = 10 ;
        int y = 20;

        int z;

//        z= x+y;
//        z=x-y;
//        z=x*y;
//        z=x/y;
        z=x%y;

        System.out.println(z);


        // AUGMENTED ASSIGNMENT OPERATORS
        x+=y;
        System.out.println(x);

        // INCREMENT DECREMENT OPERATORS
        x++;
        y--;
        System.out.println(x);
        System.out.println(y);

        // ORDER OF OPERATIONS [PEMDAS]
    }
}
