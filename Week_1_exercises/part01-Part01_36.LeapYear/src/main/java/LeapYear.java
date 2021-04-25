
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a year:");
        int year = Integer.valueOf(scan.nextLine());
        
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("The year is a leap year.");
                } else {
                    System.out.println("The year is not a leap year.");
                }
            } else {
                System.out.println("The year is a leap year.");
            }
        } else {
            System.out.println("The year is not a leap year.");
        }
    }
}

/*
Sample output
Give a year: 2011
The year is not a leap year.

Sample output
Give a year: 2012
The year is a leap year.

Sample output
Give a year: 1800
The year is not a leap year.

Sample output
Give a year: 2000
The year is a leap year.
*/