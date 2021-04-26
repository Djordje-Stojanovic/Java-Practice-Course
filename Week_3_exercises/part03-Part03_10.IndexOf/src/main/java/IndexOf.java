
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        System.out.println("Search for?");
        int search = Integer.valueOf(scanner.nextLine());
        
        for (int i = 0; i < list.size(); i++) {
            int vergleich = list.get(i);
            
            if (search == vergleich) {
                System.out.println(search + " is at index " + i);
            }
        }
    }
}

/*
72
2
8
8
11
-1

Search for? 2
2 is at index 1
*/