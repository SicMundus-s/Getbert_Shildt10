package JavaUtilConcurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class SemaphoreClass {
    public static void main(String args[]) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(200);

        Connection connection = Connection.getConnection();

        for(int i = 0; i < 200; i ++) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        connection.work();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            });
        }
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.DAYS);

    }
}

class Connection {
    private static Connection connection = new Connection(); // Singleton
    private int connectionCount;

    Semaphore semaphore = new Semaphore(3); //������������ ������������ ������� ������������ ������ �� ������
    private Connection() {
    }

    public static Connection getConnection() {
    return connection;
    }

    public void work() throws InterruptedException {
        semaphore.acquire(); // ����� ���� ������(permits). ���� ��� ������� ������ ������� ��������, �� acquire �� ������ ���������� ������ ���� �� ����������� ������
        try{
            doWork();
        }finally {
            // release ������ ������������� � ���� finally. ��� ������� ���������� ������� � ����� ������ ����� �����������
            semaphore.release();
        }

    }

    private void doWork() throws InterruptedException {
        synchronized (this) {
            connectionCount++;
            System.out.println(connectionCount);
        }
        Thread.sleep(5000); // work...

        synchronized (this) {
            connectionCount--;
        }
    }
}