
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfNum = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int num1 = Integer.valueOf(scanner.nextLine());
            
            if (num1 == 0) {
                break;
            }
            
            if (num1 < 0) {
                numOfNum = numOfNum+1;   
            }
        }
        System.out.println("Number of negative numbers: " + numOfNum);
    }
}
