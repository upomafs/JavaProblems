

import java.util.Scanner;

public class Loops {


    /**
     * A function that will print following series upto Nth terms,
     * 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, …….
     *
     * @param n This is the nth term of the the given series
     */
    public void problemOne(int n) {

        String seriesOutput = "";
        for (int i = 1; i <= n; i++) {
            if (i != n) {
                seriesOutput = seriesOutput + i + " ,";
            } else {
                seriesOutput = seriesOutput + i;
            }
        }
        System.out.print("Required output series for the value of n: " + seriesOutput);

    }

    /**
     * A function that will print following series upto Nth terms,
     * 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31 …….
     *
     * @param n This is the nth term of the series
     */
    public void problemTwo(int n) {

        String seriesOutput = "";
        int p = 2;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                seriesOutput = seriesOutput + i + " ,";
            } else if (i != 1 && i != n) {
                seriesOutput = seriesOutput + (1 + p) + " ,";
                p += 2;
            } else if (i != 1 && i == n) {
                seriesOutput = seriesOutput + (1 + p);
            }
        }
        System.out.print("Required output series for the value of n:" + seriesOutput);
    }


    /**
     * A function that will print following series upto Nth terms,
     * 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, …….
     *
     * @param n This is the nth term of the series
     */
    public void problemThree(int n) {

        String seriesOutput = "";
        ;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0 && i != n) {
                seriesOutput = seriesOutput + 1 + " ,";
            } else if (i % 2 == 0 && i != n) {
                seriesOutput = seriesOutput + 0 + " ,";
            } else if (i % 2 != 0 && i == n) {
                seriesOutput = seriesOutput + 1;
            } else if (i % 2 == 0 && i == n) {
                seriesOutput = seriesOutput + 0;
            }
        }
        System.out.print("required output series for the value of n: " + seriesOutput);
    }


    /**
     * A function that will take N numbers as inputs, and then it will
     * compute and print the average of inputs.,
     */
    public void problemFour() {
        System.out.println("Enter number of inputs (n) : ");

        Scanner scObj = new Scanner(System.in);
        int n = scObj.nextInt();
        double sum = 0;

        System.out.println("Enter the numbers: ");
        for (int i = 1; i <= n; i++) {
            double input = scObj.nextDouble();
            sum += input;
        }
        double avg = sum / n;
        double finalAns = Math.round(avg * 1000000) / 1000000.0;
        System.out.println("Average of " + n + " inputs: " + finalAns);
    }


    /**
     * A function that will that will take two numbers X and Y as inputs.
     * Then it will print the square of X and increment (if X<Y) or decrement (if X>Y) X by 1,
     * until X reaches Y. If and when X is equal to Y,the program prints “Reached!,
     */
    public void problemFive() {
        System.out.println("Enter first number(X) : ");

        Scanner scObjInput = new Scanner(System.in);
        int x = scObjInput.nextInt();

        System.out.println("Enter second number(Y) : ");
        int y = scObjInput.nextInt();

        int change = x < y ? 1 : -1; // if x < y, change: 1    if x > y, change: -1

        for (; x != y; x += change) {
            System.out.print((x * x) + ", ");
        }

        System.out.println("Reached!");


//        int sqr = x * x;
//
//        String finalString = "";
//        if(x==y){
//            System.out.println("Reached!");
//        }
//        else{
//            finalString = finalString + ", " + sqr;
//            while(x!=y){
//                if(x<y) {
//                    x++;
//                    sqr = x * x;
//                    finalString = finalString + ", " + sqr;
//                }
//                else if(x>y){
//                    x--;
//                    sqr = x * x;
//                    finalString = finalString + ", " + sqr;
//                }
//            }
//            if(x==y) {
//                finalString = finalString + "Reached!";
//            }
//            System.out.println("Your Required Series of squares: "+ finalString);
//        }

    }

    /**
     * A function that  will take keyboard inputs and print them until
     * the user types an ’A’ on the keyboard
     */
    public void problemSix() {
        System.out.println("Enter inputs (if you enter 'A' program will be terminated): ");

        Scanner typeInput = new Scanner(System.in);
        String checkChar;
        while (true) {
            checkChar = typeInput.next();
            if (checkChar.equals("A")) break;
            System.out.println(checkChar);
        }
        System.out.println("Program terminated because you typed 'A'");
    }


    /**
     * A function that  will that will reverse the digits of an input integer
     */
    public void problemSeven() {
        System.out.println("Enter an integer number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while (num > 0) {
            int lastDigit = num % 10;
            System.out.print(lastDigit);
            num = num / 10;
        }
    }

    /**
     * A function the sum of first Nth terms for the following series,
     * 1, -2, 3, -4, 5, -6, 7, -8, 9, -10, 11, -12, 13, -14, …….
     *
     * @param n This is the nth term of the series
     */
    public void problemEight(int n) {
        int sum = 0;
        int negMultiply = 1;
        for (int i = 1; i <= n; i++) {
            if (i == 1 && i == n) sum += i;
            else if (i == 1 && i != n) sum += i;
            else if (i != 1 && i != n) {
                sum += i * (-1 * negMultiply);
                negMultiply *= -1;
            } else if (i != 1 && i == n) {
                sum += i * (-1 * negMultiply);
            }
        }
        System.out.println("Required sum of the series: " + sum);
    }


    /**
     * A function that will calculate and print the result for the first Nth terms of the following series,
     * 1^2.2 + 2^2.3 + 3^2.4 + 4^2.5 + …….
     *
     * @param n This is the nth term of the series
     */
    public void problemNine(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (i * i) * (i + 1);

        }
        System.out.println("Required sum of the series: " + sum);
    }


    /**
     * A function that will print Fibonacci series upto Nth terms,
     * 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, …….
     *
     * @param n This is the nth term of the series
     */
    public void problemTen(int n) {
        int fibo1 = 0, fibo2 = 1;
        for (int i = 1; i <= n; i++) {
            System.out.println(fibo2);
            int temp = fibo2;
            fibo2 = fibo1 + fibo2;
            fibo1 = temp;
        }
//        System.out.println("Required fibonacci Series:" + fibonacciSeries);
    }


    /**
     * A function that will calculate and print the factorial (N!) of a given number N,
     *
     * @param n This is the number for calculating and printing the required factorial output
     */
    public void problemEleven(int n) {
        int fact = 1;
        // String factorialStr = "";
        int p = n;
        if (n == 0) System.out.println("Required factorial: 0! = 1");
        else {
            System.out.print("Required factorial: " + n + "! = ");
            for (int i = 1; i <= n; i++) {
                if (p > 1) {
                    fact *= i;
//                    factorialStr += p + "*";
                    System.out.print(p + " x ");
                    p--;
                } else {
                    fact *= i;
//                    factorialStr += Integer.toString(p);
                    System.out.print(1);
                }
            }
        }
        System.out.println(" = " + fact);

    }


    /**
     * A function that will calculate and print x^y (x to the power y) where x, y are positive integers without using
     * any built in function
     *
     * @param x This is the number for finding the output of the function
     * @param y This is the power for finding the output of the function
     */
    public void problemTwelve(int x, int y) {
        int powerVal = 1;
        if (x < 0 || y < 0) System.out.println("Sorry values of parameters can't be negative");
        else if (x == 0) System.out.println("Required output: " + 0);
        else if (y == 0) System.out.println("Required output: " + 1);
        else {
            for (int i = 1; i <= y; i++) {
                powerVal *= x;
            }
            System.out.println("Required output: " + powerVal);
        }
    }

    /**
     * A function that will determine and print whether a number is a prime number or not
     *
     * @param n This is the number to determine whether it is a prime number or not
     */
    public void problemThirteen(int n) {
        if (n < 2) System.out.println("IT IS NOT A PRIME NUMBER");
        else if (n == 2) System.out.println("IT IS A PRIME NUMBER");
        else if (n % 2 == 0) System.out.println("IT IS A NOT A PRIME NUMBER");
        else {
            boolean isPrime = true;
            for (int i = 3; i < n; i += 2) {
                if (n % i == 0) {
                    isPrime = false;
                    System.out.println("IT IS NOT A PRIME NUMBER");
                    break;
                }
            }

            if (isPrime == true) {
                System.out.println("IT IS A PRIME NUMBER");
            }
        }
    }


    /**
     * A function that will determine and print whether an integer number is a palindrome number or not
     *
     * @param n This is the number to determine whether it is a palindrome number or not
     */
//    public void problemFourteen(int n) {
//    int lastDigit;
//    String numStr = "";
//    int numInt;
//    int checkPalindrome = n;
//    String intToStr = Integer.toString(n);
//    int len = intToStr.length();
//        for (int i = 1; i<=len; i++){
//            lastDigit = n % 10;
//            numStr += lastDigit;
//            n = n /10;
//        }
//        numInt = Integer.parseInt(numStr);
//        if(numInt==checkPalindrome) System.out.println("It is a palindrome number");
//        else System.out.println("It is not a palindrome number");
//    }
    public void problemFourteen(int n) {
        int storeNum = 0;
        int lastDigit;
        int checkPalindrome = n;

        while (n != 0) {
            lastDigit = n % 10;
            storeNum = storeNum * 10 + lastDigit;
            n = n / 10;
        }
        if (storeNum == checkPalindrome) System.out.println("It is a palindrome number");
        else System.out.println("It is not a palindrome number");
    }


    /**
     * A function that will take an integer number n as a parameter and then calculate and print the sum of the following series
     * 1 + 12 + 123 + 1234 + …….
     *
     * @param n This is the nth term of the series
     */

    public void problemFifteen(int n) {
        int sum = 1;
        int val = 1;

        if (n < 0) {
            System.out.println("Value of n must be positive");
        } else if (n == 0 || n == 1) {
            System.out.println("Required sum of the series: " + n);
        } else {
            for (int i = 2; i <= n; i++) {
                val = (val * 10) + i;
                sum = sum + val;
            }
            System.out.println("Required sum of the series: " + sum);
        }
    }


    public static void main(String[] args) {
        Loops test = new Loops();
//        test.problemOne(14);
//        test.problemTwo(11);
//        test.problemThree(13);
//        test.problemFour();
//        test.problemFive();
//        test.problemSix();
//        test.problemSeven();
//        test.problemEight(1);
//        test.problemNine(7);
//        test.problemTen(3);
//        test.problemEleven(2);
//        test.problemTwelve(-1, -5);
//        test.problemThirteen(5);
//        test.problemFourteen(110);
        test.problemFifteen(5);
    }
}