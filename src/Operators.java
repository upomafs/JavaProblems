import java.util.Scanner;

public class Operators {

    /**
     * A function that will take two numbers as inputs, then calculate and print the values of their addition,
     * subtraction, multiplication, and division (quotient and reminder)
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

    public static void main(String[] args) {
        Operators test = new Operators();
        test.problemOne();
    }
}