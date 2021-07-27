package classroom_26_07;

public class NumbersThread extends Thread {
    private int from;
    private int to;

    public NumbersThread(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void run() {
        for (int i = from; i <= to; i++) {
            System.out.println("number: " + i);
            System.out.println("Thread name: " + Thread.currentThread().getName());

        }
    }

    public static void main(String[] args) {
        new NumbersThread(0, 10).start();
        new NumbersThread(11, 20).start();


    }
}
