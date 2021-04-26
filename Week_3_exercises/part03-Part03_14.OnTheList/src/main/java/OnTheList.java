
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        
        System.out.println("Search for?");
        String search = scanner.nextLine();

        boolean ja = list.contains(search);
        
        if (ja) {
            System.out.println(search + " was found!");
        } else {
            System.out.println(search + " was not found!");
        }
    }
}

/*
Tom
Emma
Alex
Mary

Search for? Mary
Mary was found!
*/