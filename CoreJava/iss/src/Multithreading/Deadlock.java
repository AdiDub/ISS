package Multithreading;

public class Deadlock {
    public static void main(String[] args) {
        String lock1="",lock2 = "";
        Thread thread1 = new Thread(() -> {
            synchronized (lock1){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2){
                    System.out.println("locks acquired");
                }
            }
        },"Thread 1");

        Thread thread2 = new Thread(() -> {
            synchronized (lock2){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock1){
                    System.out.println("locks acquired");
                }
            }
        });

        thread1.start();
        thread2.start();

        //this program will be an infinite loop as a deadlock has occured
    }
}
