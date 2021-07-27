package homework_28_07.multithread;

import java.util.Scanner;

public class SummatorApp {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int from1 = scanner.nextInt();
        int to1 = scanner.nextInt();
        int from2 = scanner.nextInt();
        int to2 = scanner.nextInt();
        RangeSummator summator1 = new RangeSummator(from1, to1);
        RangeSummator summator2 = new RangeSummator(from2, to2);
        summator1.start();
        summator1.join();
        summator2.start();
        summator2.join();
        long partialSum1 = summator1.getResult();
        long partialSum2 = summator2.getResult();

        long sum = partialSum1 + partialSum2;
        System.out.println(sum);
    }
}
