package java_homework_week04;

/**
 * 6. Write a program in Java to display the pattern like a triangle with a number.
 *  For e.g.
 *  Input number of rows: 10
 *  Expected Output:
 *  1
 *  12
 *  123
 *  1234
 *  12345
 *  123456
 *  1234567
 *  12345678
 *  123456789
 *  12345678910
 */

import java.util.Scanner;

public class P06NumberTriangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows:");

        numTriangle(scanner.nextInt());

        scanner.close();

    }

    public static void numTriangle(int number) {


        for (int i = 0; i <= number; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1);
            }
            System.out.println("");
        }

    }

}
