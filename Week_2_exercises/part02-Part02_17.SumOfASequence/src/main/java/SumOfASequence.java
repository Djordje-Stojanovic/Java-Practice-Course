
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Last number?");
        int last = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        int cnt = 1;
        
        while (cnt <= last) {
            sum = sum+cnt;
            cnt++;
        }
        System.out.println("The sum is " + sum);
    }
}

/*
Last number? 3
The sum is 6

The previous example calculated 1 + 2 + 3 = 6
*/