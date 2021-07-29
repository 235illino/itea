package homework_02_08.primary_number;

public class Task implements Runnable {
    private int a;

    public Task(int a) {
        this.a = a;
    }

    public boolean isPrime(int number) {
        if (number < 3) {
            return false;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(number); i = i + 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


    @Override
    public void run() {
        if (a == 0) {
            System.out.println("Finished");
            return;
        } else if (isPrime(a)) {
            System.out.println(String.format("number %d is prime", a));
        }
    }
}
