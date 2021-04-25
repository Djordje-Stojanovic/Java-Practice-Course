
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = 100;
        int end = Integer.valueOf(scanner.nextLine());
        
        for(; end < start+1; end++) {
            System.out.println(end);
        }
    }
}
