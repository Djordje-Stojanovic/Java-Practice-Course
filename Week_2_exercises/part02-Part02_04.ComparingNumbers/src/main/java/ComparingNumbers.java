
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.valueOf(scanner.nextLine());
        int num2 = Integer.valueOf(scanner.nextLine());
        
        if (num1 == num2) {
            System.out.println(num1 + " is equal to " + num2);
        } else if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else {
            System.out.println(num1 + " is smaller than " + num2);
        }
    }
}

/*
8
4
8 is greater than 4.

Sample output
-3
5
-3 is smaller than 5.

Sample output
1
1
1 is equal to 1
*/