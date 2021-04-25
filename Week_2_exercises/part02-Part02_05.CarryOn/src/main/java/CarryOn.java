
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Shall we carry on?");
            
            String eingabe = scanner.nextLine();
            
            if (eingabe.equals("no")) {
                break;
            }
        }
    }
}

/*
Shall we carry on?
yes
Shall we carry on?
ye
Shall we carry on?
y
Shall we carry on?
no
*/