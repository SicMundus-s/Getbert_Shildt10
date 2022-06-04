package Synchronized;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Worker {

    Object lock1 = new Object(); // Этот объект получает свой монитор
    Object lock2 = new Object(); // И этот объект получает свой монитор
    Random random = new Random();
    List<Integer> myList1 = new ArrayList<>();
    List<Integer> myList2 = new ArrayList<>();

    public void addToMyList1() {
        synchronized (lock1) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            myList1.add(random.nextInt(100));
        }
    }

    public void addToMyList2() {
        synchronized (lock2) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            myList2.add(random.nextInt(100));
        }
    }

    public void completion() {
            for (int i = 0; i < 100; i++) {
                addToMyList1();
                addToMyList2();
            }

    }

    public void work() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                completion();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                completion();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("List1: " + myList1.size());
        System.out.println("List2: " + myList2.size());
    }
}
