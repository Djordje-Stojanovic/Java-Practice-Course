
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {        
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("First number?");
        int cnt = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Last number?");
        int last = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        
        while (cnt <= last) {
            sum = sum+cnt;
            cnt++;
        }
        System.out.println("The sum is " + sum);
    }
}

/*
First number? 3
Last number? 5
The sum is 12
*/