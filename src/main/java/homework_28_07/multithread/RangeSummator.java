package homework_28_07.multithread;

public class RangeSummator extends Thread {
    private int from;
    private int to;
    private int result;

    public RangeSummator(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void run() {
        for (int i = from; i <= to; i++) {
            result += i;
        }
    }

    public long getResult() {
        return result;
    }
}
