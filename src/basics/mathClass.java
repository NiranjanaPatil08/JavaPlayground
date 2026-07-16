package basics;

public class mathClass {
    public static void main(String[] args) {
        System.out.printf("%.2f is value of pi\n",Math.PI);
        System.out.printf("%.2f is value of e\n",Math.E);

        double result;
        result = Math.pow(2,3);
        result = Math.abs(-1);
        result = Math.sqrt(9);
        result = Math.round(Math.PI);
        result = Math.ceil(Math.PI);
        result = Math.floor(Math.PI);
        result = Math.max(10,20);
        result = Math.min(10,20);

        System.out.println(result);

    }
}
