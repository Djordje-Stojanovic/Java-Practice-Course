
import java.util.Scanner;

public class Adulthood {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int num = Integer.valueOf(scanner.nextLine());
        
        if (num > 17) {
            System.out.println("You are an adult");
        } else {
            System.out.println("The are not an adult");
        }
    }
}

/*
How old are you?
32
You are an adult   
*/