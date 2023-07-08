package Multithreading;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        // Code to be executed in the thread
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread: " + i);
            try {
                Thread.sleep(1000); // Pause the thread for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start(); // Start the thread

        // Code executed by the main thread
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread: " + i);
            try {
                Thread.sleep(1000); // Pause the main thread for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
