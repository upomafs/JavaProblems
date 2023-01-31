import java.util.Scanner;

public class Conditions {


    /**
     * A function that will check whether a triangle is valid when the three angles
     * (angle value should be such that 0 < value < 180) of the triangle are entered through the keyboard.
     * [Hint: A triangle is valid if the sum of all three angles is equal to 180 degrees.]
     *
     */
    public void problemOne(int angleOne, int angleTwo, int angleThree) {
        int sumOfTheAngles = angleOne + angleTwo + angleThree;

        if ((angleOne <= 0 || angleOne >= 180) ||
                (angleTwo <= 0 || angleTwo >= 180) ||
                (angleThree <= 0 || angleThree >= 180)) {
            System.out.println("Angles of the triangle should be in the range of greater than 0 degrees and less than 180 degrees.");

        } else if (sumOfTheAngles != 180) {
            System.out.println("The sum of the angles on the triangle should be equal to 180 degrees.");
        } else {
            System.out.println("The Sum of the angles on the triangle: " + sumOfTheAngles);
        }
    }


    /**
     * A function that will check whether a year is a leap year or not,
     * [Hint: A year is a leap year if ( Year % 4 == 0 && year % 100 != 0 )   ||  ( Year % 400 ==0 )]
     *
     * @param year This is the value to check whether it is a leap year or not
     */
    public void problemTwo(int year) {

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            System.out.println("It is a leap year");
        else
            System.out.println("It is not a leap year");
    }


    /**
     * A function that categorizes a single character that is entered at the terminal, whether it is an alphabet,
     * a digit or a special character
     */
    public void problemThree() {
        System.out.println("Enter a character in the terminal");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int asciiVal = ch;

        if ((asciiVal >= 65 && asciiVal <= 90) || (asciiVal >= 97 && asciiVal <= 122)) {
            System.out.println("The character is an Alphabet");
        } else if (asciiVal >= 48 && asciiVal <= 57) {
            System.out.println("The character is a digit");
        } else {
            System.out.println("The character is a special character");
        }
    }


    /**
     * A function that chat will construct a menu for performing arithmetic operations. The user will give two real
     * numbers (a, b) based on which the arithmetic operations will be completed and an integer number
     * (1 <= Choice <= 4) as a choice. Choice-1, 2, 3, and 4 perform addition, subtraction, multiplication, and
     * division(quotient),respectively.
     */
    public void problemFour() {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter first real number in the terminal");
        double num1 = sc1.nextDouble();
        System.out.println("Enter second real number in the terminal");
        double num2 = sc1.nextDouble();

        System.out.println("Enter arithmetic operation choice where 1 = Addition, 2 = Subtraction, 3 = Multiplication, 4 = Division(quotient)");
        int arithmeticOperator = sc1.nextInt();
        double result;
        int quotientResult;

        if (arithmeticOperator == 1) {
            result = num1 + num2;
            System.out.println("Addition: " + result);
        } else if (arithmeticOperator == 2) {
            result = num1 - num2;
            System.out.println("Subtraction: " + result);
        } else if (arithmeticOperator == 3) {
            result = num1 * num2;
            System.out.println("Multiplication: " + result);
        } else if (arithmeticOperator == 4) {
            quotientResult = (int) (num1 / num2);
            System.out.println("Quotient: " + quotientResult);
        } else {
            System.out.println("Not a valid operation");
        }

    }

    /**
     * A function that chat will evaluate and calculate simple expressions from the following format:
     * <number1>   <operator>   <number2>;
     * where operators are (+, - , *, /)
     * and if the operator is “/”, then check if <number2> nonzero or not
     */
    public void problemFive() {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the expression where operators are (+, - , *, /): ");
        double num1 = sc2.nextDouble();
        String operator = sc2.next();
        double num2 = sc2.nextDouble();
        double result;
        int quotientResult;

        if (operator.equals("+")) {
            result = num1 + num2;
            System.out.println("Addition: " + result);
        } else if (operator.equals("-")) {
            result = num1 - num2;
            System.out.println("Subtraction: " + result);
        } else if (operator.equals("*")) {
            result = num1 * num2;
            System.out.println("Multiplication: " + result);
        } else if (operator.equals("/")) {
            if(num2==0) System.out.println("Denominator cannot be zero!");
            else{
                quotientResult = (int) (num1 / num2);
                System.out.println("Division: " + quotientResult);
            }
        } else {
            System.out.println("Not a valid operation");
        }
    }

    public static void main(String[] args) {
        Conditions test = new Conditions();
//        test.problemOne(160, 20, 30);
//        test.problemTwo(2014);
//        test.problemThree();
//        test.problemFour();
        test.problemFive();
    }
}
