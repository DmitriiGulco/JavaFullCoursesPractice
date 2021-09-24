package JavaCore;
import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scanner.nextLine();

        System.out.println("How old are you? ");
        int age = scanner.nextInt();
        scanner.nextLine(); //this line clears the scanner memory after nextInt() method. Delete this line if you want to check this by yourself

        System.out.println("What is your task for today? ");
        String task = scanner.nextLine();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your task for today is " + task);


    }
}
