package java_homework_week04;

/**
 * 11. Even Digit Sum
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 * The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.
 * EXAMPLE INPUT/OUTPUT:
 * * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
 * * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
 * * getEvenDigitSum(-22); → should return -1 since the number is negative
 * NOTE: The method getEvenDigitSum should be defined as public static
 */

import java.util.Scanner;

public class P11EvenDigitSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number:");
        int digit = scanner.nextInt();
        int result = getEvenDigitSum(digit);
        System.out.println("The sum of even digits is :" + result);
    }
    public static int getEvenDigitSum(int number) {

        if (number < 0) {
            return -1;
        }

        int digit = 0;
        int digitSum = 0;

        while (number != 0) {
            digit = number % 10;

            if (digit % 2 == 0) {
                digitSum = digitSum + digit;
            }

            number = number / 10;
        }
        return digitSum;
    }

}
