
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = 0;
        int end = Integer.valueOf(scanner.nextLine());
        
        for(; start < end+1; start++) {
            System.out.println(start);
        }
    }
}

/*
4
0
1
2
3
4
*/