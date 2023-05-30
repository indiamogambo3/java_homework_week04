package java_homework_week04;

/**
 * 3. Write a Java program that takes the user to provide a single character from the
 *  alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 *  Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 *  Input an alphabet: p
 *  Expected Output:
 *  Input letter is Consonant
 */

import java.util.Scanner;

public class P03VowelOrConsonant {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an alphabet:");
        String alphabet = scanner.next().toLowerCase();

        checkVowelOrConsonant(alphabet);

        scanner.close();
    }

    public static void checkVowelOrConsonant(String alphabet) {
        if ((alphabet.length() > 1) || (!Character.isAlphabetic(alphabet.charAt(0)))) {
            System.out.println("Error. Single alphabet not entered");
        } else if ((alphabet.charAt(0) == 'a') || (alphabet.charAt(0) == 'e') || (alphabet.charAt(0) == 'i')
                || (alphabet.charAt(0) =='o') || (alphabet.charAt(0) == 'u')) {
            System.out.println("Input alphabet is a Vowel.");
        }else {
            System.out.println("Input alphabet is Consonant.");
        }

    }

}
