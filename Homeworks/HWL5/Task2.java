package Homeworks.HWL5;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }

        // Проверяем, является ли число палиндромом
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " является палиндромом.");
        } else {
            System.out.println(originalNumber + " не является палиндромом.");
        }

        // Закрываем Scanner
        scanner.close();
    }


}
