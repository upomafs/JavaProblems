import java.util.Scanner;

public class Operators {

    /**
     * A function that takes two numbers input from the user, and then calculates and prints the values of their
     * addition, subtraction, multiplication, and division (quotient and reminder)
     */
    public void problemOne() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number one: ");
        double x = sc.nextDouble();

        System.out.print("Enter number two: ");
        double y = sc.nextDouble();

        double sum = x + y;
        double sub = x - y;
        double mult = x * y;
        double quotient = x / y;
        double remainder = x % y;

        System.out.println("Sum: " + sum);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + mult);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }


    /**
     * A function that will calculate the circumference of a circle having the radius r.
     * @param r This is the radius for calculating the circumference
     */
    public void problemTwo(double r) {
        double circumference;

        circumference = 2 * Math.PI * r;
        System.out.println("Circumference: " + circumference);
    }


    /**
     * A function that will calculate and print the value of the following equation
     * result =  (3.31 * a^2 + 2.01 * b^3) / (7.16 * b^2 + 2.01 * a^3)
     * @param a This is the first parameter to problemThree method
     * @param b This is the second parameter to problemThree method
     */
    public void problemThree(double a, double b) {
        double result;

        double aSqr = a * a;
        double bSqr = b * b;
        double aCube = aSqr * a;
        double bCube = bSqr * b;

        result =  (3.31 * aSqr + 2.01 * bCube) / (7.16 * bSqr + 2.01 * aCube);
        System.out.println("Result: " + result);
    }


    /**
     * A function that will take two parameters and print the maximum value.
     * @param x This is the first parameter to problemFour method
     * @param y This is the second parameter to problemFour method
     */
    public void problemFour(int x, int y) {
        int maxValue;

        maxValue = x > y ? x : y;
        System.out.println("Maximum Value: " + maxValue);
    }


    public static void main(String[] args) {
        Operators test = new Operators();
//        test.problemOne();
//        test.problemTwo(10.5);
//        test.problemThree(5,10.5);
        test.problemFour(50,-20);

    }
}