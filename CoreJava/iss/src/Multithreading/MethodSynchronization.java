package Multithreading;

public class MethodSynchronization {
    private int count;

    public synchronized void increment() {
        count++;
        System.out.println("Incremented count: " + count);
    }

    public synchronized void decrement() {
        count--;
        System.out.println("Decremented count: " + count);
    }
}
