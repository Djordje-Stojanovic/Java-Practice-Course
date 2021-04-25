
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a number:");
        
        int num = Integer.valueOf(scan.nextLine());
        
        if ((num % 2) == 0) {
            System.out.println("Number " + num + " is even");
        } else { 
            System.out.println("Number " + num + " is odd");
        }
    }
}

/*
Give a number:
2
Number 2 is even.

Sample output
Give a number:
7
Number 7 is odd.
*/