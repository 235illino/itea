package homework_02_08.ackermann;

import com.google.protobuf.ServiceException;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class App {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        AckermannFork ackermannFork = new AckermannFork(2,3);
        ForkJoinTask<Integer> task = ackermannFork.fork();
        forkJoinPool.submit(task);
        System.out.println(task.get());
        //executorService.shutdown();

    }
}
