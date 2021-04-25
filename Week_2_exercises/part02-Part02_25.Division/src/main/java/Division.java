

public class Division {

    public static void main(String[] args) {

        division(3, 5);
    }
    
    public static void division(int numerator, int denominator) {
        double sum = 1.0*numerator/denominator;
        System.out.println(sum);
        
    }
}

/*
Write a method public static void division(int numerator, int denominator)
that prints the result of the division of the numerator by the denominator
Keep in mind that the result of the division of the integers is an integer
— in this case we want the result to be a floating point number.
*/