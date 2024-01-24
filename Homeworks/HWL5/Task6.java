package Homeworks.HWL5;

import java.util.Arrays;
import java.util.Random;

public class Task6 {

    public static void main(String[] args) {

        int[] array = new int[45];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101) - 50;
        }

        // Находим минимальный элемент
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        // Находим максимальный элемент
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        // Выводим результаты на консоль
        System.out.println(Arrays.toString(array));
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
    }

}
