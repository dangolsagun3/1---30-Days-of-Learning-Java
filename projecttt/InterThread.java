// Create a Java program that demonstrates inter-thread communication using wait() and notify() methods, where one thread produces data and another thread consumes it, printing messages to show how the threads coordinate.
package projecttt;
class SharedResource {
    private int data;
    private boolean isProduced = false;

    public synchronized void produce(int value) throws InterruptedException {
        while (isProduced) {
            wait(); // Wait until the data is consumed
        }
        data = value;
        System.out.println("Produced: " + data);
        isProduced = true;
        notify(); // Notify the consumer thread
    }

    public synchronized void consume() throws InterruptedException {
        while (!isProduced) {
            wait(); // Wait until the data is produced
        }
        System.out.println("Consumed: " + data);
        isProduced = false;
    }
}

class Producer extends Thread {
    private SharedResource resource;

    public Producer(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                resource.produce(i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    private SharedResource resource;

    public Consumer(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                resource.consume();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class InterThread {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Producer producer = new Producer(resource);
        Consumer consumer = new Consumer(resource);
        producer.start();
        consumer.start();
    }
}
