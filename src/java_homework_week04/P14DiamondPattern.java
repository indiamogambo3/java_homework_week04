package java_homework_week04;

/**
 * 14. Write a program in Java to display the pattern like a diamond.
 *  While loop
 *       *
 *      ***
 *     *****
 *    *******
 *   *********
 *  ***********
 * *************
 *  ***********
 *   *********
 *    *******
 *     *****
 *      ***
 *       *
 */

import java.util.Scanner;

public class P14DiamondPattern {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int a = scanner.nextInt();
        System.out.println("Enter symbol");
        char b = scanner.next().charAt(0);
        printDiamond(a, b);

        scanner.close();
    }

    public static void printDiamond(int num, char ch) {

        int i = 1;
        int j;

        while (i <= num) {
            j = 1;
            while (j++ <= num - i) {
                System.out.print(" ");
            }

            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print(ch);
            }

            System.out.println();
            i++;
        }

        i = num - 1;
        while (i > 0) {
            j = 1;
            while (j++ <= num - i) {
                System.out.print(" ");
            }

            j = 1;

            while (j++ <= i * 2 - 1) {
                System.out.print(ch);
            }

            System.out.println();
            i--;

        }

    }

}
