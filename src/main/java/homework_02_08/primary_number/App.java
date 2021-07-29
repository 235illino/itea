package homework_02_08.primary_number;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExecutorService executor = Executors.newFixedThreadPool(3);

        while (true) {
            int num = scanner.nextInt();
            Task task = new Task(num);
            executor.submit(task);
            if(num == 0) {
                executor.shutdown();
                return;
            }
        }
    }

}
