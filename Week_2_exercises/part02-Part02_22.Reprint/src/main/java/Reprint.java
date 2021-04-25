
import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How many times?");
        int num = Integer.valueOf(scanner.nextLine());
        int start = 0;
        
        while (start < num) {
            printText();
            start++;
        } 
    }
    

    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}

/*
How many times?
7
In a hole in the ground there lived a method
*/