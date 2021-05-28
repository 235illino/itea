package homework;

import java.util.Arrays;

import static java.util.Arrays.copyOf;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = {1, -9, 5, 5, 6, -7, 3, 7, -2, 0}; //массив целых чисел

        int[] result = copyOf(numbers, numbers.length);
        /*
        Задание 1
В массиве целых чисел поменять местами максимальный отрицательный элемент
и минимальный положительный.
         */
        int min = result[0];
        int indexMin = 0;
        int max = result[0];
        int indexMax = 0;
        for (int i = 1; i < result.length; i++) {
            if (min > result[i]) {
                min = result[i];
                indexMin = i;
            }
            if (max < result[i]) {
                max = result[i];
                indexMax = i;
            }
        }
        int temp = result[indexMin];
        result[indexMin] = result[indexMax];
        result[indexMax] = temp;

//Код программы
        System.out.println("Задание 1");
        System.out.println("Numbers: " + Arrays.toString(numbers));
        System.out.println("Result: " + Arrays.toString(result));

        /*
        Задание 2
В массиве целых чисел заменить нулями отрицательные элементы.
         */
        int[] result1 = copyOf(numbers, numbers.length);
        for (int i = 0; i < result1.length; i++) {
            if (result1[i] < 0) {
                result1[i] = 0;
            }

        }
        System.out.println("Задание 2");
        System.out.println("Numbers: " + Arrays.toString(numbers));
        System.out.println("Result: " + Arrays.toString(result1));

        /*
        Задание 3
В массиве целых чисел утроить каждый положительный элемент, который стоит
перед отрицательным.
         */
        int[] result2 = copyOf(numbers, numbers.length);
        for (int i = 0; i < result2.length; i++) {
            if (result2[i] > 0) {
                if (result2[i + 1] < 0) {
                    result2[i] *= 3;
                }
            }

        }
        System.out.println("Задание 3");
        System.out.println("Numbers: " + Arrays.toString(numbers));
        System.out.println("Result: " + Arrays.toString(result2));

    }


}
