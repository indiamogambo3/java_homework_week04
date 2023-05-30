package java_homework_week04;

/**
 * 9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */

import java.util.Scanner;

public class P09FibonacciNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number:");

        fibonacciNumber(scanner.nextInt());

        scanner.close();
    }

    public static void fibonacciNumber(int count) {

        int num1 = 0, num2 = 1, num3;


        System.out.print(num1 + " " + num2);

        for (int i = 2; i < count; i++) {
            num3 = num1 + num2;
            System.out.print(" " + num3);
            num1 = num2;
            num2 = num3;
        }
    }


}
