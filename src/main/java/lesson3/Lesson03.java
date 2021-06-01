package lesson3;

import java.util.Arrays;

public class Lesson03 {
    public static void main(String[] args) {
        int[][] numbers = new int[5][];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = new int[i+1];
            Arrays.fill(numbers[i], i + 1);

        }
        System.out.println(Arrays.deepToString(numbers));




    }
}
