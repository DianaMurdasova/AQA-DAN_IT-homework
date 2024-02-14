package Homeworks.HWL8;

import java.util.Arrays;

public class Methods {

    public static void main(String[] args) {
        int[] numArray = {1, 45, 78, 1098, 53, 8, 79, 653};
        String randomString = "randomString";
        int randomInt = 4;
        String[] stringsArray = {"One", "Two", "Three", "Four"};

        Methods methods = new Methods();
        methods.ourMethod();
        methods.ourMethod(numArray);
        methods.ourMethod(randomString);
        methods.ourMethod(stringsArray);
        System.out.println();
        methods.ourMethod(randomInt, randomString);
        methods.printEvenAndOdd(numArray);

    }


//    Написать метод, принимающий в качестве параметра массив целых чисел.
//    И выводит на экран все четные числа списком, a также нечетные числа списком.

    public void printEvenAndOdd(int[] arrayForSort) {
        System.out.println("Четные числа:");
        for (int num : arrayForSort) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println("\nНечетные числа:");
        for (int num : arrayForSort) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }

//    Написать перегруженный метод, который может:
//
//            •	Не принимать никаких значений, тогда он будет выводить на консоль сообщение типа: "Я пустой".
//            •	Принимать в качестве параметров String, тогда он будет выводить на консоль это сообщение.
//            •	Принимать в качестве параметров массив строк, тогда он будет выводить на консоль все его значения через пробел.
//            •	Принимать в качестве параметра массив чисел, тогда он будет выводить на консоль сумму элементов массива.
//            •	Принимать в качестве параметров число и строку, тогда он будет выводить на консоль сообщение типа:
//        "Ваше сообщение - "%%%%%%%%", ваше число -  $", где "%%%%%%%%" и $ ваши введенные строка и число соответственно.

    public void ourMethod() {
        System.out.println("Я пустой");
    }

    public void ourMethod(String ourStringMessage) {
        System.out.println(ourStringMessage);
    }

    public void ourMethod(String[] ourStringArray) {
        for (String s : ourStringArray) {
            System.out.print(s + " ");
        }
    }

    public void ourMethod(int[] ourIntArray) {
        int sum = 0;
        for (int i = 0; i < ourIntArray.length; i++) {
            sum = sum + ourIntArray[i];
        }
        System.out.println(sum);
    }

    public void ourMethod(int ourNumber, String ourMessage) {
        System.out.println("Ваше сообщение - " + ourMessage + ", ваше число - " + ourNumber);
    }
}
