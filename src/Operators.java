import java.util.Scanner;

public class Operators {

    /**
     * * A function that takes two numbers input from the user, and then calculates and prints the values of their
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


    public static void main(String[] args) {
        Operators test = new Operators();
//        test.problemOne();
        test.problemTwo(10.5);

    }
}