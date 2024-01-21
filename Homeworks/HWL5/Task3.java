package Homeworks.HWL5;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите общий вес, который может храниться на складе: ");
        int totalCapacity = scanner.nextInt();
        int remainingCapacity = totalCapacity;

        while (remainingCapacity > 0) {
            System.out.println("\nОстаток места на складе: " + remainingCapacity);

            System.out.print("Введите вес металла для сдачи на склад (или 0 для выхода): ");
            int metalWeight = scanner.nextInt();

            if (metalWeight == 0) {
                System.out.println("Программа завершена.");
                break;
            }

            if (metalWeight < 5) {
                System.out.println("Невозможно принять металл весом менее 5. Пожалуйста, введите больший вес.");
                continue;
            }

            if (metalWeight > remainingCapacity) {
                System.out.println("Невозможно принять металл. Недостаточно места на складе.");
            } else {
                remainingCapacity -= metalWeight;
                System.out.println("Металл успешно принят на склад. Остаток места: " + remainingCapacity);
            }
        }

        scanner.close();
    }
}
