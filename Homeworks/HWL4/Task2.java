package Homeworks.HWL4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод сторон треугольника
        System.out.println("Введите длину первой стороны:");
        int side1 = scanner.nextInt();
        System.out.println("Длина первой стороны = "+ side1);

        System.out.println("Введите длину второй стороны:");
        int side2 = scanner.nextInt();
        System.out.println("Длина первой стороны = "+ side2);

        System.out.println("Введите длину третьей стороны:");
        int side3 = scanner.nextInt();
        System.out.println("Длина первой стороны = "+ side3);

        //Проверяем можно ли построить треугольник с такими сторонами

        if (side1 + side2 > side3){
            System.out.println("Вы можете построить треугольник со сторонами:"+side1+","+side2+","+side3);
        } else if (side1 + side3 > side2) {
            System.out.println("Вы можете построить треугольник со сторонами:"+side1+","+side2+","+side3);
        } else if (side2 + side3 > side1) {
            System.out.println("Вы можете построить треугольник со сторонами:"+side1+","+side2+","+side3);
        }else{
            System.out.println("Вы не можете построить треугольник со сторонами:"+side1+","+side2+","+side3);
        }
    }
}
