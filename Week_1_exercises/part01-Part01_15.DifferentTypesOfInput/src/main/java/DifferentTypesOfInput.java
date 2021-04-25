
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a string:");
        String strg = scanner.nextLine();
        System.out.println("Give an integer:");
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a double:");
        double num2 = Double.valueOf(scanner.nextLine());
        System.out.println("Give a boolean:");
        boolean bol = Boolean.valueOf(scanner.nextLine());
        
        System.out.println("You gave the string " + strg);
        System.out.println("You gave the integer " + num1);
        System.out.println("You gave the double " + num2);
        System.out.println("You gave the boolean " + bol);

    }
}

/*
Give a string:
bye-bye
Give an integer:
11
Give a double:
4.2
Give a boolean:
true
You gave the string bye-bye
You gave the integer 11
You gave the double 4.2
You gave the boolean true
*/