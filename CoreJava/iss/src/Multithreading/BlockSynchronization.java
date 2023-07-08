package Multithreading;

public class BlockSynchronization {
    private final Object lock = new Object();

    public void print(String message) {
        synchronized (lock) {
            // Synchronized block of code
            System.out.print("[");
            System.out.print(message);
            System.out.println("]");
        }
    }
}
