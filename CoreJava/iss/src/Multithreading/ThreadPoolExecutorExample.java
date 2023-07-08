package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExecutorExample {
    public static void main(String[] args) {
        // Create a ThreadPoolExecutor with 2 threads
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Submit tasks to the executor
        executor.submit(new Task("Task 1"));
        executor.submit(new Task("Task 2"));
        executor.submit(new Task("Task 3"));
        executor.submit(new Task("Task 4"));
        executor.submit(new Task("Task 5"));

        // Shut down the executor
        executor.shutdown();
    }
}

class Task implements Runnable {
    private String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Executing " + name + " in thread: " + Thread.currentThread().getName());
        // Perform the task's work here
    }
}
