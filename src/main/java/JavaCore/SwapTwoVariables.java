package JavaCore;

public class SwapTwoVariables {

    public static void main(String[] args) {

        String a = "water";
        String b = "coffee";
        String temp;                     //temp variable for storage values

        temp = a;
        a = b;
        b = temp;

        System.out.println("a: " + a);
        System.out.println("b: " + b);

    }



}
