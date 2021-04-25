
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many days would you like to convert to seconds?");
        int day = Integer.valueOf(scanner.nextLine());
        int sec = day*60*60*24;
        System.out.println(sec);
    }
}

/*
How many days would you like to convert to seconds?
1
86400
*/