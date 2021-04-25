
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number:");
            
            int eingabe = Integer.valueOf(scanner.nextLine());
            
            if (eingabe == 4) {
                break;
            }
        }
    }
}

/*
Give a number:
5
Give a number:
744
Give a number:
22
Give a number:
-1
Give a number:
4
*/