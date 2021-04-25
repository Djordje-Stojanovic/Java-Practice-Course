
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Password?");
        String input = scan.nextLine();
        
        String compare = "Caput Draconis";
        
        if (input.equals(compare)) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
    }
}

/*
Password?
Wattlebird
Off with you!

Sample output
Password?
Caput Draconis
Welcome!
*/