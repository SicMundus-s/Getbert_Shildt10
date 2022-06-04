package PatternProducerConsumer;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
// Паттер Produce&Consumer - Произвоидель&Потребитель 2 потока управления
// Produce(Производить) - Поток исполнения производящий что-либо
// Consumer - Второй поток управления. Потребитель. Получает то, что производит produce
public class Main {
    private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);  //Пул потоков
    public static void main(String args[]) {
    Thread thread1 = new Thread(new Runnable() {
        @Override
        public void run() {
            try {
                producer();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    });

    Thread thread2 = new Thread(new Runnable()   {
        @Override
        public void run() {
            try {
                consumer();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    });

    thread1.start();
    thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    private static void producer() throws InterruptedException {
        Random random = new Random();

        while (true) {
        queue.put(random.nextInt(100));
        }

    }
    private static void consumer() throws InterruptedException {
        while (true) {
            Thread.sleep(100);
            System.out.println(queue.take());
            System.out.println("Queue size: " + queue.size());
        }

    }

}
