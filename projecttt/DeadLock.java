package projecttt;

class Resource {
    private String name;

    public Resource(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class DeadLock {
    public static void main(String[] args) {

        final Resource resource1 = new Resource("Resource 1");
        final Resource resource2 = new Resource("Resource 2");

        // Thread 1
        Thread t1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1 locked " + resource1.getName());

                try { Thread.sleep(100); } catch (InterruptedException e) {}

                System.out.println("Thread 1 waiting for " + resource2.getName());

                // Trying to lock resource2
                synchronized (resource2) {
                    System.out.println("Thread 1 locked " + resource2.getName());
                }
            }
        });

        // Thread 2
        Thread t2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2 locked " + resource2.getName());

                try { Thread.sleep(100); } catch (InterruptedException e) {}

                System.out.println("Thread 2 waiting for " + resource1.getName());

                // Trying to lock resource1
                synchronized (resource1) {
                    System.out.println("Thread 2 locked " + resource1.getName());
                }
            }
        });

        t1.start();
        t2.start();
    }
}