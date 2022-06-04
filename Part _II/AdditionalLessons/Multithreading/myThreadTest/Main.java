package myThreadTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        MyThread myThread = new MyThread();
        myThread.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        myThread.shutdown();
    }
}

class MyThread extends Thread {

    private volatile boolean running = true; // volatile ��������� ������������ ���������� � ���� ���������� �������� �� ����� ������
    @Override                                // ����� ������� ���������� ���������������� ����� ��������.
    public void run() {
        while (running) {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e) {
                System.out.println("������ � MyThread");
            }

        }

    }
    public void shutdown() {
        this.running = false;
    }


}