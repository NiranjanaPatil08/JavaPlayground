package basics;

public class varargs {
    public static void main(String[] args) {
        // varargs => allow a method to accept a varying no of args
        //            makes methods more flexible, no need for overloaded methods
        //            java packs the args into an array ... (ellipsis)


        int total = add(1,3,4,5);
        System.out.println(total);
        int total1 = add(1,5);
        System.out.println(total1);
        int total2 = add(1,3,4,5, 6,6,7,3);
        System.out.println(total2);
    }

    public static int add(int... nums){
        int total =0;
        for (int num : nums){
            total+=num;
        }
        return total;

    }
}
