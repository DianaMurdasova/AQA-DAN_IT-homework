package Homeworks.HWL5;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        String[] names = {"Петя", "Маша", "Алёна", "Федя", "Саша", "Антон", "Глеб"};
        int[] hours = {10, 12, 14, 16, 18, 20};
        String[] places = {"школу", "магазин", "церковь", "тренажерный зал", "кино", "поликлинику"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите три числа (индексы):");
        int indexName = scanner.nextInt();
        int indexHour = scanner.nextInt();
        int indexPlace = scanner.nextInt();

        // Проверка на корректность введенных индексов
        if (indexName < 0 || indexName >= names.length ||
                indexHour < 0 || indexHour >= hours.length ||
                indexPlace < 0 || indexPlace >= places.length) {
            System.out.println("Некорректные индексы!");
        } else {
            // Вывод сообщения на основе введенных индексов
            String name = names[indexName];
            int hour = hours[indexHour];
            String place = places[indexPlace];

            System.out.println(name + " будет идти в " + place + " в " + hour + ":00");
        }

        scanner.close();
    }

}
