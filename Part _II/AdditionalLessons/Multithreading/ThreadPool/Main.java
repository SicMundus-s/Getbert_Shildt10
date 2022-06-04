package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String args[]) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5); // Пул потоков

        for(int i = 0; i < 5; i++) {
            executorService.submit(new Work(i));
        }
        executorService.shutdown(); // прекращает набор задач(Work) и переходит к исполнению
        System.out.println("All tasks submitted");
        executorService.awaitTermination(1, TimeUnit.DAYS); // Прекратит выполнение задач после истечения указанного времени
    }
}

class Work implements Runnable {
    private int id;

    Work(int id) {
        this.id = id;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(500);
        }catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Work " + id + " has completion");
    }
}