package JavaUtilConcurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockClass {
    public static void main(String args[]) throws InterruptedException {
        Task task = new Task();
        /*Task task = new Task();
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for(int i = 0; i < 2; i ++) {
            executorService.submit(new Task());
        }

        executorService.shutdown();
        task.showCounter();

         */

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                task.firstThread();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                task.secondThread();
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        task.showCounter();
    }

}

class Task {
    private int counter;

    Lock lock = new ReentrantLock();

    private void increment() {
        for(int i = 0; i < 10000; i++) {
            counter++;
        }

    }

    public void firstThread() {
        lock.lock();
        increment();
        lock.unlock();
    }

    public void secondThread() {
        lock.lock();
        increment();
        lock.unlock();
    }


    public void showCounter() {
        System.out.println(counter);
    }
}