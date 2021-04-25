
public class AdvancedAstrology {

    public static void printStars(int number) {
        int cnt = 0;
        
        while (cnt < number) {
            System.out.print("*");
            cnt++;
        }
        System.out.println("");
    }
    
    public static void printStars2 (int number) {
        int cnt = 0;
        
        while (cnt < number) {
            System.out.print("*");
            cnt++;
        }
    }

    public static void printSpaces(int number) {
        int cnt = 0;
        
        while (cnt < number) {
            System.out.print(" ");
            cnt++;
        }
    }

    public static void printTriangle(int size) {
        int ispace = size-1;
        int istar = 1;
        while (ispace != -1) {
            printSpaces(ispace);
            printStars(istar);
            ispace--;
            istar++;
        }
    }

    public static void christmasTree(int height) {
        int ispace = height-1;
        int istar1 = 1;
        int istar2 = 0;
        
        while (ispace != -1) {
            printSpaces(ispace);
            printStars2(istar1);
            printStars(istar2);
            ispace--;
            istar1++;
            istar2++;
        }
        
        int istamm = height-2;
        printSpaces(istamm);
        printStars(3);
        printSpaces(istamm);
        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        christmasTree(10);

    }
}
