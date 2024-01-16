package Homeworks.HWL3;

public class Task3 {
//    При применении к массиву строк поля length, можно узнать сколько элементов находится в массиве.
//    Тоесть если у Вас есть массив строк типа: String[] arrayOfString; то при вызове поля lenth:
//    int size = arrayOfString.length; можно получить какое количество символов находится в данном массиве.
//    Попробовать, используя метод split и информацию по поводу поля length, вывести на экран какое количество раз
//    символ 'a' встречается в  строке:
//            "Completely random text in English. In it, we just need to determine how many times the character 'a' occurs there. And we can use the split method and the length method."
//    Решить данную задачу с учетов верхнего и нижнего регистра символа 'a'.

    public static void main(String[] args) {
        String taskText = "Completely random text in English. In it, we just need to determine how many times the character 'a' " +
                "occurs there. And we can use the split method and the length method.";
        String[] textSplitA =taskText.split("a");
        int countLowerCaseA = textSplitA.length-1;
        System.out.println("Столько раз в тексте встречается буква \"а\" в нижнем регистре: " + countLowerCaseA);

        String[] textSplitUpperA =taskText.split("A");
        int countUpperCaseA = textSplitUpperA.length-1;
        System.out.println("Столько раз в тексте встречается буква \"А\" в верхнем регистре: " + countUpperCaseA);

        int countA = countUpperCaseA+countLowerCaseA;
        System.out.println("Столько раз в тексте встречается буква \"а\" вне зависимости от регистра: " + countA);
    }

}
