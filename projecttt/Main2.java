package projecttt;
// Create a class that implements Runnable
class MessageRunnable implements Runnable {

    // Override the run() method
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread is running... Message " + i);
                Thread.sleep(500); // 500 milliseconds delay
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}

// Main class
public class Main2 {
    public static void main(String[] args) {
        // Create an object of Runnable class
        MessageRunnable obj = new MessageRunnable();

        // Pass the Runnable object to Thread
        Thread t = new Thread(obj);

        // Start the thread
        t.start();
    }
}
