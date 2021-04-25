
import java.util.Scanner;

public class AverageOfNumbers {

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
        double average = 1.0*sumOfNum/numOfNum;
        System.out.println("Average of the numbers: " + average);
        
    }
}
