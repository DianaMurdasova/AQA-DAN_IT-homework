package Homeworks.HWL4;

import java.util.Scanner;

public class Task5 {

//    Написать программу, используя тернарный оператор, где пользователь вводит с клавиатуры два числа и символ – или + или % или / или *.
//    На экран выводится резултат действия над двумя введенными числами.
//    Если пользователь ввел что-то кроме данных символов, то необходимо вывести 0.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод двух чисел и оператора
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        System.out.print("Введите оператор (+, -, *, /, %): ");
        char operator = scanner.next().charAt(0);

        // Вычисление результата с использованием тернарного оператора
        double result = (operator == '+') ? num1 + num2 : 
                (operator == '-') ? num1 - num2 : 
                        (operator == '*') ? num1 * num2 : 
                                (operator == '/') ? (num2 != 0 ? num1 / num2 : 0) :
                                        (operator == '%') ? (num2 != 0 ? num1 % num2 : 0) : 0;

        // Вывод результата
        System.out.println("Результат: " + result);
    }
}
