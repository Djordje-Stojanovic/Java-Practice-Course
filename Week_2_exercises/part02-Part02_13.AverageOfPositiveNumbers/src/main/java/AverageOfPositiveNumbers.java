
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfpos = 0;
        int sumOfpos = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int num1 = Integer.valueOf(scanner.nextLine());
            
            if (num1 == 0) {
                break;
            }
            
            if (num1 > 0) {
                numOfpos = numOfpos+1;
                sumOfpos = sumOfpos+num1;
            }
        }
        
        if (numOfpos == 0) {
            System.out.println("Cannot calculate the average");
            return;
        }
        double averageOfpos = 1.0*sumOfpos/numOfpos;
        System.out.println(averageOfpos);
        
    }
}

/*
3
5
1
-3
0
3.0

Sample output
0
Cannot calculate the average

Sample output
-3
1
0
1.0

Sample output
1
1
0
1.0
*/