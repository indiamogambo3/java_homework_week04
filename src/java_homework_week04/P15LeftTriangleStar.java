package java_homework_week04;

/**
 * 15. Display left angle triangle of * using nested for loops
 *  *
 *  * *
 *  * * *
 *  * * * *
 *  * * * * *
 */

import java.util.Scanner;

public class P15LeftTriangleStar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        leftTriangle(scanner.nextInt());
    }

    public static void leftTriangle(int num) {

        int i, j;

        for (i = 1; i <= num; i++) {

            for (j = 1; j <= i; j++) {

                System.out.print("*");
            }

            System.out.print("\n");
        }
    }

}
