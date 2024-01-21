package Homeworks.HWL5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
            //Создаем массив
            int[] array = new int[10];
            Random random = new Random();

            //Заполняем массив случайными числами от 0 до 40
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(40);
            }

            // Выводим массив
            System.out.println("Массив:"+ Arrays.toString(array));

            // Запрашиваем у пользователя число для поиска
            Scanner scanner = new Scanner(System.in);
            System.out.print("\nВведите число для поиска: ");
            int searchNumber = scanner.nextInt();

            // Проверяем, есть ли введенное число в массиве
            boolean findNumber = false;
            for (int i = 0; i < array.length; i++){
                if (array[i]==searchNumber){
                    findNumber = true;
                    break;
                }
            }

            // Выводим результат
            if (findNumber) {
                System.out.println("Число " + searchNumber + " найдено в массиве.");
            } else {
                System.out.println("Число " + searchNumber + " не найдено в массиве.");
            }

    }
}
