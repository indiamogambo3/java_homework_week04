package java_homework_week04;

/**
 * 2. -Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */

import java.util.Scanner;

public class P02MinAndMaxInputChallenge {

    public static void main(String[] args) {
        minAndMaxNumbers();
    }

    public static void minAndMaxNumbers() {

        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean first = true;

        while (true) {
            System.out.println("Enter number:");
            boolean isNumber = scanner.hasNextInt();
            if (isNumber) {
                int number = scanner.nextInt();
                if (first) {
                    first = false;
                    min = number;
                    max = number;
                }
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            }else {
                break;
            }

            scanner.nextLine();
        }
        System.out.println("Minimum number is : " + min);
        System.out.println("Maximum number is : " + max);
    }









}




