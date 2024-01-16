package Homeworks.HWL3;

public class Task1 {
    public static void main(String[] args) {
    /*Создать переменную string1 = "This line that i want to cut, cause it is too long".
    Создать строку string2 в которой должно быть помещено значение строки string1,
    Обрезанное до "This line that i want to cut, cause".
    Создать строку string3 на основе string2 которое будет содержать значение
    "This line that don't want to cut, cause it is perfect".
    Вывести на консоль каждое сообщение и его длину.*/

    String string1 = "This line that I want to cut, cause it is too long";

    String string2 = string1.substring(0,string1.length()-15);

    String string3 = string2.replace("want", "don't want") + " it is perfect";

        System.out.println(string1 + "\nДлина этой строки 1: " + string1.length());
        System.out.println(string2 + "\nДлина этой строки 2: " + string2.length());
        System.out.println(string3 + "\nДлина этой строки 3: " + string3.length());


    }
}
