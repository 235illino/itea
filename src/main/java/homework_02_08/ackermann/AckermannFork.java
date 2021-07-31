package homework_02_08.ackermann;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class AckermannFork extends RecursiveTask<Integer> {
    private int m;
    private int n;


    public AckermannFork(int m, int n) {
        this.m = m;
        this.n = n;
    }

    @Override
    protected Integer compute() {
        int result = 0;
        final List<ForkJoinTask<Integer>> tasks = new ArrayList<>();
        final List<ForkJoinTask<Integer>> tasksJ = new ArrayList<>();
        if (m == 0) {

            return n + 1;
        } else if (n == 0) {

            tasks.add(new AckermannFork(m - 1, 1).fork());

        } else {
            int j = 0;
            AckermannFork ackermann = new AckermannFork(m, n - 1);
            tasksJ.add(ackermann.fork());
            if (!tasksJ.isEmpty()) {
                for (ForkJoinTask<Integer> task : tasks) {
                    task.join();
                }
            }

            ForkJoinPool forkJoinPool = new ForkJoinPool();

            ForkJoinTask<Integer> taskJ = ackermann.fork();
            forkJoinPool.submit(taskJ);

            try {
                j = taskJ.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
            tasks.add(new AckermannFork(m - 1, j).fork());
        }
        if (!tasks.isEmpty()) {
            for (ForkJoinTask<Integer> task : tasks) {
                task.join();
                try {
                    result = task.get();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }
}
