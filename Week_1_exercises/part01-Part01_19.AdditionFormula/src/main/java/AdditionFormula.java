
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int num2 = Integer.valueOf(scanner.nextLine());
        
        int sum = num1 + num2;

        System.out.println(num1 + " + " + num2 + " = " + sum);
    }
}

/*
Give the first number:
73457
Give the second number:
12888
73457 + 12888 = 86345
*/