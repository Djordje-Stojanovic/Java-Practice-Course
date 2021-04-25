
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfNum = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int num1 = Integer.valueOf(scanner.nextLine());
            
            if (num1 == 0) {
                break;
            }
            
            numOfNum = numOfNum+1;
        }
        System.out.println("Number of numbers: " + numOfNum);
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
*/