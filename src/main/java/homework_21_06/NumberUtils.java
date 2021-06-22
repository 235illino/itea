package homework_21_06;

import java.util.Arrays;
import java.util.List;

public class NumberUtils {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,3,8,9,5,7);
        System.out.println(NumberUtils.getSum(numbers));
        System.out.println(NumberUtils.multiplyOddNumber(numbers));
    }

    public static int getSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer i : numbers) {
            sum += i;
        }
        return sum;
    }

    public static int multiplyOddNumber(List<Integer> numbers) {
        int result = 1;
        for (Integer i : numbers) {
            if (i%2 != 0) {
                result *= i;
            }
        }
        return result;
    }
}
