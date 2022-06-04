package PatternProducerConsumer;

import java.util.LinkedList;
import java.util.Queue;

public class MyProducerConsumer {
    public static void main(String args[]) throws InterruptedException {
       ProducerConsumer producerConsumer = new ProducerConsumer();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    producerConsumer.produce();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    producerConsumer.consumer();
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
class ProducerConsumer {
    private Queue<Integer> queue = new LinkedList<>();
    private final int LIMIT = 10;
    private final Object lock = new Object();
    public void produce() throws  InterruptedException {
        int value = 0;
        while (true) {
        synchronized (lock) {
            while(queue.size() == LIMIT) {
                lock.wait();
            }
            queue.add(value++);
            lock.notify(); // Уведомляет wait из consumer о нахождение элемента в очереди
            }
        }
    }
    public void consumer() throws InterruptedException {
        while(true) {
            synchronized (lock) {
                while(queue.size() == 0) {
                    lock.wait();
                }

                int value = queue.poll(); // Вытаскивает элемент из очереди
                System.out.println(value);
                System.out.println("Queue size is: " + queue.size());
                lock.notify(); // Уведомляет wait в produce о освобождение места в очереди
            }
            Thread.sleep(1000);
        }
    }
}