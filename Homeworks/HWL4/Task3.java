package Homeworks.HWL4;

import java.util.Scanner;

public class Task3 {

    //    При помощи тернарного оператора необходимо получить разность двух чисел введенных с
//    клавиатуры, и всегда отнимать от большего меньшее. Вывести эту разность в консоль.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int num1 = scanner.nextInt();

        System.out.println("Введите второе число:");
        int num2 = scanner.nextInt();

        int biggerNum = num1 > num2 ? num1 - num2 : num2 - num1;

        if (num1>num2){
            System.out.println(num1 + "-" + num2 + "=" + biggerNum);
        } else {
            System.out.println(num2 + "-" + num1 + "=" + biggerNum);
        }
    }
}
