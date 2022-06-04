package JavaUtilConcurrent;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
// concurrent(параллельный) - Пакет с классами для многопоточного программирования

public class CountDownLatchClass {
    public static void main(String args[]) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(3); // Защёлка обратного отсчёт - грубый перевод

        ExecutorService executorService = Executors.newFixedThreadPool(3); // Создание трёъ потоков

        for(int i = 0; i < 3; i++) {
            executorService.submit(new Processor(countDownLatch)); // Назначение задания трём потокам
        }
        executorService.shutdown(); // Обязательно! даёт понять executorService что все задания назначены
        countDownLatch.await(); // Ожидания завершения счётчика(countDownLatch)
        System.out.println("submit звершил работу ");
    }
}

class Processor implements Runnable {
    private CountDownLatch countDownLatch;

    public Processor(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        countDownLatch.countDown();
    }
}