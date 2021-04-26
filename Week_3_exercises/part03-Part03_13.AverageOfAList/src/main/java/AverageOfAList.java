
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> liste = new ArrayList<>();
        
        while (true) {
            int eingabe = Integer.valueOf(scanner.nextLine());
            
            if (eingabe == -1) {
                break;
            }
            liste.add(eingabe);
        }
        
        int sum = 0;
        
        for (int num : liste) {
            sum = sum + num;
        }
        
        double avg = sum*1.0/liste.size();
        
        System.out.println("Average: " + avg);
        // Then it computes the average of the numbers on the list
        // and prints it.
        
    }
}
