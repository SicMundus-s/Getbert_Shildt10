package Synchronized;

public class Main {
    private  int counter;
    public static void main(String args[]) throws InterruptedException {
       // Main test = new Main(); // ������� ������ ���������� Monitor
        // test.doWork();

        long before = System.currentTimeMillis();

        Worker worker = new Worker();
        worker.work();

        long after = System.currentTimeMillis();
        System.out.println(after - before);
    }

    public synchronized void increment() {
        counter++;
    }

    public void doWork() throws InterruptedException {


        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 10000; i++ ) {
                    increment();
                }
            }
        });
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 10000; i++ ) {
                    //counter++;  // counter = counter + 1 �������� �� ��������(�� ����������� �� ���� ����)
                    increment();
                }
            }
        });

        thread.start();
        thread1.start();

        thread.join(); // ��������� ��������� ������
        thread1.join();
        System.out.println(counter);
    }
}
