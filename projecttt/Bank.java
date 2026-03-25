package projecttt;

class BankAccount {
    private int balance = 1000; // initial balance

    // synchronized deposit method
    public synchronized void deposit(int amount) {
        System.out.println(Thread.currentThread().getName() + " depositing: " + amount);
        balance += amount;
        System.out.println("Balance after deposit: " + balance);
    }

    // synchronized withdraw method
    public synchronized void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " withdrawing: " + amount);
        
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Balance after withdrawal: " + balance);
        } else {
            System.out.println("Insufficient balance for " + Thread.currentThread().getName());
        }
    }

    public int getBalance() {
        return balance;
    }
}

// Thread class for transactions
class TransactionThread extends Thread {
    private BankAccount account;

    public TransactionThread(BankAccount account, String name) {
        super(name);
        this.account = account;
    }

    public void run() {
        account.deposit(500);
        account.withdraw(700);
    }
}

public class Bank {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        // Creating two threads
        TransactionThread t1 = new TransactionThread(account, "Thread-1");
        TransactionThread t2 = new TransactionThread(account, "Thread-2");

        // Starting threads
        t1.start();
        t2.start();

        // Wait for threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        // Final balance
        System.out.println("Final Balance: " + account.getBalance());
    }
}
