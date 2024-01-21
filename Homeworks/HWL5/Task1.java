package Homeworks.HWL5;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = "";

        System.out.println("Введите слова. Для завершения введите STOP.");

        while (true) {
            String word = scanner.next();

            if (word.equalsIgnoreCase("STOP")) {
                break;
            }

            sentence = sentence + (word + " ");
        }

        System.out.println("Полученное предложение: " + sentence.trim());
        scanner.close();
    }
}


