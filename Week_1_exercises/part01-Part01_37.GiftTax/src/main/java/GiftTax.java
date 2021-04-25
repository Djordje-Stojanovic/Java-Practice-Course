
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int gift = Integer.valueOf(scan.nextLine());
        double tax = 0;
        
        if (gift < 5000) {
            System.out.println("No tax!");
        } else if (gift < 25000) {
            tax = 1.0*(100+(gift-5000)*0.08);
            System.out.println("Tax: " + tax);
        } else if (gift < 55000) {
            tax = 1.0*(1700+(gift-25000)*0.1);
            System.out.println("Tax: " + tax);
        }  else if (gift < 200000) {
            tax = 1.0*(4700+(gift-55000)*0.12);
            System.out.println("Tax: " + tax);
        }   else if (gift < 1000000) {
            tax = 1.0*(22100+(gift-200000)*0.15);
            System.out.println("Tax: " + tax);
        }   else if (gift > 999999) {
            tax = 1.0*(142100+(gift-1000000)*0.17);
            System.out.println("Tax: " + tax);
        } 

    }
}
/*
Value of gift	Tax at the lower limit	Tax rate(%) for exceeding part
5 000 — 25 000	100	8
25 000 — 55 000	 1 700	10
55 000 — 200 000	4 700	12
200 000 — 1 000 000	22 100	15
1 000 000 —	142 100	17

Value of the gift?
3500
No tax!

Value of the gift?
5000
Tax: 100.0
*/
