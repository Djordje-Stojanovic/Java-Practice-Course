
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int points = Integer.valueOf(scan.nextLine());
     
        if (points < 0) {
            System.out.println("Grade: impossible!");
        } else if (points < 50) {
            System.out.println("Grade: failed");
        } else if (points < 60) {
            System.out.println("Grade: 1");
        } else if (points < 70) {
            System.out.println("Grade: 2");
        } else if (points < 80) {
            System.out.println("Grade: 3");
        } else if (points < 90) {
            System.out.println("Grade: 4");
        } else if (points < 101) {
            System.out.println("Grade: 5");
        } else {
            System.out.println("Grade: incredible");
        }
        
    }
}

/*
< 0	impossible!
0-49	failed
50-59	1
60-69	2
70-79	3
80-89	4
90-100	5
> 100	incredible!
Sample outputs:

Sample output
Give points [0-100]:
37
Grade: failed

Sample output
Give points [0-100]:
76
Grade: 3

Sample output
Give points [0-100]:
95
Grade: 5

Sample output
Give points [0-100]:
-3
Grade: impossible!
*/