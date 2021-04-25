
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int num2 = Integer.valueOf(scanner.nextLine());
        
        int sum = num1 + num2;
        int diff = num1 - num2;
        int mul = num1 * num2;
        double div = num1*1.0/num2;
        
        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " - " + num2 + " = " + diff);
        System.out.println(num1 + " * " + num2 + " = " + mul);
        System.out.println(num1 + " / " + num2 + " = " + div);
    }
}

/*
Give the first number:
9
Give the second number:
2
9 + 2 = 11
9 - 2 = 7
9 * 2 = 18
9 / 2 = 4.5
*/