
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int num1 = Integer.valueOf(scanner.nextLine());
            
            if (num1 == 0) {
                break;
            }
            sum = num1 + sum;
            
        }
        System.out.println("Sum of the numbers: " + sum);

    }
}

/*
Sample output
Give a number:
5
Give a number:
22
Give a number:
9
Give a number:
-2
Give a number:
0
Sum of the numbers: 34
*/