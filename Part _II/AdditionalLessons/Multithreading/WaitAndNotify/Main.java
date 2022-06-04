package WaitAndNotify;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws InterruptedException {
        WaitAndNotify waitAndNotify = new WaitAndNotify();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    waitAndNotify.produce();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    waitAndNotify.consumer();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println("End main");
    }
}

class WaitAndNotify {
    public void produce() throws InterruptedException {
    synchronized (this) {
        System.out.println("Producer thread started...");
        wait(); // Вызывается только в пределах синхранизованого блока в объекте this(this.wait)
        // Ожидает вызова notify(Уведомлять)
        System.out.println("Producer thread resumed...");
        }
    }

    public void consumer() throws InterruptedException {
        Thread.sleep(2000);
        Scanner scanner = new Scanner(System.in);
        synchronized (this) {
            System.out.println("Waiting for return key pressed");
            scanner.nextLine();
            notify(); // Активирует приостановленный поток
        }

    }
}