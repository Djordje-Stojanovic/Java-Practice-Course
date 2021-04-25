
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfNum = 0;
        int sumOfNum = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int num1 = Integer.valueOf(scanner.nextLine());
            
            if (num1 == 0) {
                break;
            }
            
            numOfNum = numOfNum+1;
            sumOfNum = sumOfNum+num1;
        }
        
        System.out.println("Number of numbers: " + numOfNum);
        System.out.println("Sum of the numbers: " + sumOfNum);
    }
}

/*
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
Number of numbers: 4
Sum of the numbers: 34
*/