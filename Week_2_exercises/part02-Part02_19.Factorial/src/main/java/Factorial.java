
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int num1 = Integer.valueOf(scanner.nextLine());
        int cnt = 1;
        int sum = 1;
        
        while (cnt <= num1) {
            sum = sum*cnt;
            cnt++;
        }
        System.out.println("Factorial: " + sum);
        
    }
}

/*
Give a number: 3
Factorial: 6

The internal calculation here was 1 * 2 * 3 = 6
*/