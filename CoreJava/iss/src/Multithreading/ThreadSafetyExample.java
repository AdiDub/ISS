package Multithreading;

public class ThreadSafetyExample {
    private int instanceVariable = 0;

    public synchronized void incrementInstanceVariable() {
        instanceVariable++;
        System.out.println("Instance Variable: " + instanceVariable);
    }

    public void performThreadUnsafeOperation() {
        int localVariable = 0;
        localVariable++;
        System.out.println("Local Variable: " + localVariable);
    }

    public static void main(String[] args) {
        ThreadSafetyExample example = new ThreadSafetyExample();

        // Creating multiple threads that concurrently access the instance variable
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                example.incrementInstanceVariable();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                example.incrementInstanceVariable();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Creating multiple threads that perform a thread-unsafe operation on a local variable
        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                example.performThreadUnsafeOperation();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread4 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                example.performThreadUnsafeOperation();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
