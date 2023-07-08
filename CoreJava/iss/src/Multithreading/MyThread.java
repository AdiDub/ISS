package Multithreading;

public class MyThread extends Thread {
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
        MyThread myThread = new MyThread();
        myThread.start(); // Start the thread

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
