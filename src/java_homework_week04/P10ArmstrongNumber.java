package java_homework_week04;

/**
 * 10. Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */

import java.util.Scanner;

public class P10ArmstrongNumber {

    public static void main(String[] args) {

        armstrongNumber();
    }
    public static void armstrongNumber() {

        int num, number, temp, total = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input any number : ");
        num = scanner.nextInt();
        temp = num;

        while (num > 0) {
            number = num % 10;
            total = total + (number * number * number);
            num = num / 10;
        }

        if (temp == total) {
            System.out.println(temp + " Is an Armstrong number.");
        } else {
            System.out.println(temp + " Is not an Armstrong number");
        }

    }

}
