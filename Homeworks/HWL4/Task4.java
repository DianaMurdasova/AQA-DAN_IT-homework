package Homeworks.HWL4;

import java.util.Scanner;

public class Task4 {

//    (Использовать операторы if-else-if) Пользоватьель вводит с клавиатуры числа:
//    Если число равно 1, то выводим на консоль “Понедельник”;
//    Если число равно 2, то выводим на консоль “Вторник”;
//    Если число равно 3, то выводим на консоль “Среда”;
//    Если число равно 4, то выводим на консоль “Четверг”;
//    Если число равно 5, то выводим на консоль “Пятница”;
//    Если число равно 6, то выводим на консоль “Суббота”;
//    Если число равно 7, то выводим на консоль “Воскресенье”;
//    В противном случае выводим текст: “Лучше бы сегодня была пятница”.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цифру номера дня недели:");

        int day = scanner.nextInt();

        if (day == 1){
            System.out.println("Понедельник");
        } else if (day==2) {
            System.out.println("Вторник");
        } else if (day==3) {
            System.out.println("Среда");
        } else if (day==4) {
            System.out.println("Четверг");
        } else if (day==5) {
            System.out.println("Пятница");
        } else if (day==6) {
            System.out.println("Суббота");
        } else if (day==7) {
            System.out.println("Воскресенье");
        }else {
            System.out.println("Лучше бы сегодня была пятница");
        }

    }
}
