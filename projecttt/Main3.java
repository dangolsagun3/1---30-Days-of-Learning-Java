package projecttt;
// Thread class
class PriorityThread extends Thread {

    public PriorityThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " (Priority: " + getPriority() + ") - Count: " + i);
        }
    }
}

// Main class
public class Main3 {
    public static void main(String[] args) {

        // Create two threads
        PriorityThread t1 = new PriorityThread("Low Priority Thread");
        PriorityThread t2 = new PriorityThread("High Priority Thread");

        // Set priorities
        t1.setPriority(Thread.MIN_PRIORITY); // Priority = 1
        t2.setPriority(Thread.MAX_PRIORITY); // Priority = 10

        // Start threads
        t1.start();
        t2.start();
    }
}
