

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(4);
    }
    
    public static void printUntilNumber(int number) {
        int start = 1;
        
        while (start <= number) {
            System.out.println(start);
            start++;
        }
    }

}

/*
public static void printUntilNumber(int number)
public static void main(String[] args) {
    printUntilNumber(5);
}
Sample output
1
2
3
4
5
*/