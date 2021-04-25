
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the first number:");
        int num1 = Integer.valueOf(scan.nextLine());
        System.out.println("Give the second number:");
        int num2 = Integer.valueOf(scan.nextLine());
        
        if (num1 > num2) {
            System.out.println("Greater number is: " + num1);
        } else if (num1 == num2) {
            System.out.println("The numbers are equal!");
        } else {
            System.out.println("Greater number is: " + num2);
        }
    }
}

/*
Give the first number:
5
Give the second number:
3
Greater number is: 5

Sample output
Give the first number:
5
Give the second number:
8
Greater number is: 8

Sample output
Give the first number; 5
Give the second number: 5
The numbers are equal!
*/