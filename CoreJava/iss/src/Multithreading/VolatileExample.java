package Multithreading;

public class VolatileExample {
    private static volatile boolean flag = false;

    public static void main(String[] args) {
        Thread writerThread = new Thread(() -> {
            try {
                Thread.sleep(2000); // Simulating some work
                flag = true; // Updating the volatile variable
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread readerThread = new Thread(() -> {
            while (!flag) {
                // Busy waiting until the flag becomes true
            }
            System.out.println("Flag has been set to true");
        });

        writerThread.start();
        readerThread.start();
    }
}
