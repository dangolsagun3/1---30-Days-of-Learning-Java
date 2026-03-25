// Create a class that extends Thread
package projecttt;

class NumberThread extends Thread {

    // Override the run() method
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
                Thread.sleep(500); // 500 milliseconds delay
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create thread object
        NumberThread t = new NumberThread();

        // Start the thread
        t.start();
    }
}