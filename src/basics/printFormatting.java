package basics;

public class printFormatting {
    public static void main(String[] args) {
        // printf() => method used to format output
        // %[flags][width][.precision][specifier-character]  => this is a placeholder

//        String name = "SpongeBob";
//        char firstLetter = 'S';
//        int age = 30;
//        double height = 40.5;
//        boolean isEmployed = true;
//
//        System.out.printf("Hello %s\n", name);
//        System.out.printf("Your name starts with %c\n",  firstLetter);
//        System.out.printf("You are %d years old\n", age);
//        System.out.printf("Your height is %.2fcm tall\n", height);
//        System.out.printf("Employed: %b\n\n",  isEmployed );
//
//        System.out.printf("name : %s\nFirst Letter : %c\nage : %d\nheight : %.2f\nemployed : %b\n\n", name,firstLetter, age,height, isEmployed );

        // FLAGS
        // + => output a +
        // , => comma grouping separator
        // ( => enclose negative nos in ()
        // space => display - for negative and space for positive nos

//        double price1 = 9777.342;
//        double price2 = -45234.45345;
//        System.out.printf("%+.2f\n", price1);
//        System.out.printf("%+,.2f\n", price1);
//        System.out.printf("% .2f\n", price1);
//        System.out.printf("% .2f\n", price2);
//        System.out.printf("%(.2f", price2);


        // WIDTH
        // 0 => zero padding
        // number => right justified padding
        // negative number => left justified padding

        int id1 = 1;
        int id2 = 2;
        int id3 = 3;

        System.out.printf("%04d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%-4d\n", id3);
    }
}
