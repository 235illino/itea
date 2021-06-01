package homework;

import java.util.Arrays;

public class Task3_02_06 {
    /*
    Задание 1

Создать из строки, например “Java Core” массив типа char. В результате должен
получится: [‘J’, ‘A’, ‘V’, ‘A’, ‘_’,‘C’, ‘O’, ‘R’, ‘E’].
- Все символы в массиве в верхнем регистре
- Пробелы заменены на нижнее подчеркивание
*для того чтобы получить символ строки можно воспользоваться методом charAt(),
который возвращает символ по указанному индексу
Задание 2

В массиве строк
String[] words = {"first", "true", "world", "boss", “car” "crocodile", "cucumber"};
найти:
1. самое длинное слово
2. самое короткое

Задание 3
Есть многомерный массив строк, например:
{{“Java”, “Virtual”}, {“Machine”}}
Нужно объединить все элементы массивов в предложение, например: Java Virtual
Machine.
Слова отделены друг от друга пробелом
     */



    public static char[] changeStringToCharArr(String s) {
        char[] result = s.toUpperCase().toCharArray();

        for (int i = 0; i < result.length; i++) {
            if (result[i] == ' ') {
                result[i] = '_';
            }
        }

        return result;
    }


    public static String mostLong(String[] words) {
        String result = words[0];
        for (int i = 1; i < words.length; i++) {
            if (result.length() < words[i].length()) {
                result = words[i];
            }
        }
        return result;
    }
    public static String mostShort(String[] words) {
        String result = words[0];
        for (int i = 1; i < words.length; i++) {
            if (result.length() > words[i].length()) {
                result = words[i];
            }
        }
        return result;
    }

    public static String arrayToString(String[][] strings) {
        String result = "";
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                result += strings[i][j] + " ";
            }
        }
        return result.trim();
    }




    public static void main(String[] args) {
        System.out.println(Arrays.toString(changeStringToCharArr("Java Core")));
        String[] words = {"first", "true", "world", "boss", "car", "crocodile", "cucumber"};
        System.out.println(mostLong(words));
        System.out.println(mostShort(words));

        String[][] strings = {{"Java", "Virtual"}, {"Machine"}};
        System.out.println(arrayToString(strings));
    }
}
