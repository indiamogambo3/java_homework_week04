package java_homework_week04;

/**
 * 8. Display right angle triangle of @ using nested for loops
 *  @
 *  @@
 *  @@@
 *  @@@@
 *  @@@@@
 */

import java.util.Scanner;

public class P08SymbolTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number of rows:");
        symbolTriangle(scanner.nextInt());

        scanner.close();
    }

    public static void symbolTriangle(int number) {

        for (int i = 0; i <= number; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }

    }

}
