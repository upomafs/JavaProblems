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
     *
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
     *
     * @param a This is the first parameter to problemThree method
     * @param b This is the second parameter to problemThree method
     */
    public void problemThree(double a, double b) {
        double result;

        double aSqr = a * a;
        double bSqr = b * b;
        double aCube = aSqr * a;
        double bCube = bSqr * b;

        result = (3.31 * aSqr + 2.01 * bCube) / (7.16 * bSqr + 2.01 * aCube);
        System.out.println("Result: " + result);
    }


    /**
     * A function that will take two parameters and print the maximum value.
     *
     * @param x This is the first parameter to problemFour method
     * @param y This is the second parameter to problemFour method
     */
    public void problemFour(int x, int y) {
        int maxValue;

        maxValue = x > y ? x : y;
        System.out.println("Maximum Value: " + maxValue);
    }


    /**
     * A function that will take three parameters and then it will calculate and print the roots of the
     * quadratic equation (a.x^2 + b.x + c = 0) from the following formula.
     * root = (-b ± sqrt(b^2 - 4.a.c)) / 2. a
     *
     * @param a This is the first constant of the quadratic equation
     * @param b This is the second constant of the quadratic equation
     * @param c This is the third constant of the quadratic equation
     */
    public void problemFive(double a, double b, double c) {
        double partOne = (b * b) - (4 * a * c);
        double partTwo = 2 * a;

        if (partOne < 0) {
            System.out.println("Imaginary");
        } else if (partTwo == 0) {
            System.out.println("a cannot be zero");
        } else {
            double result1 = (-b + Math.sqrt(partOne)) / partTwo;
            double result2 = (-b - Math.sqrt(partOne)) / partTwo;
            System.out.println("Value of x: " + result1 + ", " + result2);
        }
    }

    /**
     * A function that will take one floating point parameter and then it will evaluate and print the values of a,b,c where
     * a = Value when x is rounded up to the nearest integer
     * b = Value when x is rounded down to the nearest integer
     * c = Absolute value of x
     *
     * @param x This is the first parameter to problemFive method
     */
    public void problemSix(double x) {
        double a = Math.ceil(x);
        double b = Math.floor(x);
        double c = Math.abs(x);
        System.out.println("Rounded up value: " + a +
                ", Rounded down value: " + b +
                ", Absolute value: " + c);
    }


    public static void main(String[] args) {
        Operators test = new Operators();
//        test.problemOne();
//        test.problemTwo(10.5);
//        test.problemThree(5,10.5);
//        test.problemFour(50,-20);
//       test.problemFive(2,4,-16);
        test.problemSix(10.6);

    }
}