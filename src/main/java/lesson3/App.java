package lesson3;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        double[] numbers = new double[10];
        fillArray(numbers);

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void fillArray(double[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Math.random();
        }
    }
}
