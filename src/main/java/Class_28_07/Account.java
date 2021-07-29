package Class_28_07;

import java.util.ArrayList;

public class Account {

    public static void main(String[] args) {
        Account account = new Account();



    }
    private volatile long balance = 0;


    public synchronized boolean withdraw(long amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public synchronized void deposit(long amount) {
        balance += amount;
    }

    public long getBalance() {
        return balance;
    }
}
