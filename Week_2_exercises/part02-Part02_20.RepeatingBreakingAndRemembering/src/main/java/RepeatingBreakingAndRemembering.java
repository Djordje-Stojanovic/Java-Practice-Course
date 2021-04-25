
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Give numbers:");
        
        int sum = 0;
        int number = 0;
        int even = 0;
        
        while (true) {
            
            int num1 = Integer.valueOf(scanner.nextLine());
            
            if (num1 == -1) {
                break;
            }
            
            sum += num1;
            number++;
            
            if (num1%2 == 0) {
                even++;
            }
            
            
        }
        
        double avg = 1.0*sum/number;
        int odd = number - even;
        
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + number);
        System.out.println("Average: " + avg);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}

/*
Give numbers:
5
2
4
-1
Thx! Bye!
*/