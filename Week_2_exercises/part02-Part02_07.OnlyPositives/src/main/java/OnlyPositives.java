
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            
            if (num < 0) {
                System.out.println("Unsuitable number");
                continue;
            } else if (num > 0) {
                int num2 = num*num;
                System.out.println(num2);
                continue;
            } else {
                break;
            }
            
            
        }
    }
}

/*
Give a number:
5
25
Give a number:
4
16
Give a number:
-3
Unsuitable number
Give a number:
1
1
Give a number:
0
*/