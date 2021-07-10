package lesson4;

public class Box {
    public static <T> void printArray(T[] a) {
        for (T t : a) {
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
        Integer[] ints = {1,5};
        printArray(ints);
        String[] strings = {"f", "u", "n"};
        printArray(strings);
    }
}
