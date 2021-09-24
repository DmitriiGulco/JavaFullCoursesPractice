package JavaCore;

public class Expresisons {

    public static void main(String[] args) {

        // expression =     operands & operators
        // operands =  values, variables, numbers, quantity
        // operators = + - * / %

        int friends = 10;

        friends++;                      //increases value by 1
        System.out.println("Friends were increased by 1 and total number is " + friends);

        friends--;                      //decreases value by 1
        System.out.println("Friends were decreased by 1 and total number is " + friends);

        friends = friends * 2;          //multiplies the value
        System.out.println("Friends were multiplied and total number is " + friends);


        friends = friends / 3;          //divides value
        System.out.println("Friends were divided and total remainders are " + friends);

        friends = 10;
        friends = friends % 3;          //divides value and return remainder of division
        System.out.println("Friends were divided and reminder of division is " + friends);

    }
}
