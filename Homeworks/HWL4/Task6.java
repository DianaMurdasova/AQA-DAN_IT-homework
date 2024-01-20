package Homeworks.HWL4;

import java.util.Scanner;

public class Task6 {

//    Используя оператор switch написать программу, которая выводит на консоль ссылку для скачивания программы.
//    Из выбора программ взять: IntelliJ IDEA, Git, Java. Из выбора ОС взять: Linux, macOS, Windows.
//    Программа должна спросить пользователя какая программа ему интересна, также спросить какую ОС он использует,
//    а после вывести в консоль необходимую ссылку.
//    Если программа с таким названием не существует выводит сообщение в консоль,
//    о том что такой программы не существует.
//    Если указанной пользователем ОС нет, то выводится сообщение в консоль, о том что такой ОС не существует.
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Выберите программу (IntelliJ IDEA, Git, Java): ");
            String selectedProgram = scanner.nextLine();

            System.out.println("Выберите операционную систему (Linux, macOS, Windows): ");
            String selectedOS = scanner.nextLine();

            switch (selectedProgram.toLowerCase()) {
                case "intellij idea":
                    switch (selectedOS.toLowerCase()) {
                        case "linux":
                            System.out.println("Ссылка для скачивания IntelliJ IDEA для Linux: https://www.jetbrains.com/idea/download/");
                            break;
                        case "macos":
                            System.out.println("Ссылка для скачивания IntelliJ IDEA для macOS: https://www.jetbrains.com/idea/download/");
                            break;
                        case "windows":
                            System.out.println("Ссылка для скачивания IntelliJ IDEA для Windows: https://www.jetbrains.com/idea/download/");
                            break;
                        default:
                            System.out.println("Такой ОС не существует");
                    }
                    break;

                case "git":
                    switch (selectedOS.toLowerCase()) {
                        case "linux":
                            System.out.println("Ссылка для скачивания Git для Linux: https://git-scm.com/download/linux");
                            break;
                        case "macos":
                            System.out.println("Ссылка для скачивания Git для macOS: https://git-scm.com/download/mac");
                            break;
                        case "windows":
                            System.out.println("Ссылка для скачивания Git для Windows: https://git-scm.com/download/win");
                            break;
                        default:
                            System.out.println("Такой ОС не существует");
                    }
                    break;

                case "java":
                    switch (selectedOS.toLowerCase()) {
                        case "linux":
                            System.out.println("Ссылка для скачивания Java для Linux: https://www.oracle.com/java/technologies/javase-downloads.html");
                            break;
                        case "macos":
                            System.out.println("Ссылка для скачивания Java для macOS: https://www.oracle.com/java/technologies/javase-downloads.html");
                            break;
                        case "windows":
                            System.out.println("Ссылка для скачивания Java для Windows: https://www.oracle.com/java/technologies/javase-downloads.html");
                            break;
                        default:
                            System.out.println("Такой ОС не существует");
                    }
                    break;

                default:
                    System.out.println("Такой программы не существует");
            }
        }
}
