package Homeworks.HWL5;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        String numStr = Integer.toString(number);

        boolean isPalindrome = true;

        for (int i = 0; i < numStr.length() / 2; i++) {
            if (numStr.charAt(i) != numStr.charAt(numStr.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(number + " - это палиндром.");
        } else {
            System.out.println(number + " - это не палиндром.");
        }

    }
}



