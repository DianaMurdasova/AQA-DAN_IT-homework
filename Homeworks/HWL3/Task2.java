package Homeworks.HWL3;

public class Task2 {
    public static void main(String[] args) {
//        Создать строку string = "Testing, is my favourite job".
//                Вывести на экран отдельно каждое слово и длину этого слова в след виде:
//        Cлово1 = (значение слова), Длина этого слова = (значение длины слов).
//        Cлово2 = (значение слова), Длина этого слова = (значение длины слов).
//        и т.д.
//                Вывести на консоль true, если первое слово длиннее остальных, в
//        противном случае вывести false.


        String string = "Testing, is my favourite job";
        string = string.replace(",", "");
        System.out.println(string);
        String[] wordsSplit = string.split(" ");

        String zero = wordsSplit[0];
        System.out.println("Слово 1 = " + zero + "; Длина этого слова = " + zero.length());
        String first = wordsSplit[1];
        System.out.println("Слово 2 = " + first + "; Длина этого слова = " + first.length());
        String second = wordsSplit[2];
        System.out.println("Слово 3 = " + second + "; Длина этого слова = " + second.length());
        String third = wordsSplit[3];
        System.out.println("Слово 4 = " + third  + "; Длина этого слова = " + third.length());
        String fourth = wordsSplit[4];
        System.out.println("Слово 5 = " + fourth + "; Длина этого слова = " + fourth.length());

    }
}
