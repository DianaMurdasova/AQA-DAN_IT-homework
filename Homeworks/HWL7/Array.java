package Homeworks.HWL7;

import java.util.Random;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод размерности двумерного массива
        System.out.print("Введите количество строк: ");
        int rows = scanner.nextInt();
        System.out.print("Введите количество столбцов: ");
        int cols = scanner.nextInt();

        // Создание двумерного массива и его заполнение случайными числами от 0 до 1000
        int[][] twoDArray = new int[rows][cols];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                twoDArray[i][j] = random.nextInt(1001); // случайное число от 0 до 1000
            }
        }

        // Вывод двумерного массива
        System.out.println("Двумерный массив:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }

        // Создание одномерного массива из максимальных значений каждого отдельного массива в двумерном
        int[] maxValuesArray = new int[rows];
        for (int i = 0; i < rows; i++) {
            int max = twoDArray[i][0];
            for (int j = 1; j < cols; j++) {
                if (twoDArray[i][j] > max) {
                    max = twoDArray[i][j];
                }
            }
            maxValuesArray[i] = max;
        }

        // Вывод одномерного массива
        System.out.println("\nОдномерный массив с максимальными значениями:");
        for (int i = 0; i < rows; i++) {
            System.out.print(maxValuesArray[i] + "\t");
        }
    }
}
