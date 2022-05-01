package chapter11_Multithreading;

class NewThread extends Thread // Реализация с помощью наследования класса Thread
{
    NewThread() {
        super("Третий поток");
        System.out.println(getName() + this);
        start();
    }

    public void run() {
        for(int i = 5; i < 10; i++) {
            try {
                System.out.println(getName() + " " + i);
                Thread.sleep(250);
            }catch (InterruptedException e) {
                System.out.println("Третий поток прерван");
            }
        }
        System.out.println(getName() + " завершён");
    }
}


class NewThreadV2 implements Runnable { // Реализация с помощью интерфейса
    Thread t;
    private String name;

    NewThreadV2(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("Новый поток: " + t);
        t.start();
    }
    public void run() {
        try {
            for(int i = 0; i < 5; i++) {
                System.out.println(t.getName() + ": " + i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e) {
            System.out.println(name +  " прерван");
        }
        System.out.println(name + " завершён");
    }
}



public class Main {
    public static void main(String args[]) {
        Thread t = Thread.currentThread();
        NewThreadV2 ob1 = new NewThreadV2("One");
        NewThreadV2 ob2 = new NewThreadV2("Two");
        NewThreadV2 ob3 = new NewThreadV2("Three");
        System.out.println("Поток " + ob1.t.getName() +" запущен: " + ob1.t.isAlive()); // isAliva возращает true/false
        System.out.println("Поток " + ob2.t.getName() +" запущен: " + ob2.t.isAlive());
        System.out.println("Поток " + ob3.t.getName() +" запущен: " + ob3.t.isAlive());

        t.setName("Главный поток");
       // System.out.println("Изменённое имя потока: " + t);
       // System.out.println(t.getName());
        try {
            for (int i = 5; i > 0; i--) {
                ob1.t.join(); // Метод join определённые в классе Thread
                ob2.t.join(); // Заставляет ожидать завершения потоков исполнения
                ob3.t.join(); // После запускается метод главный поток
                System.out.println(t.getName() + " " + i);
            }
        }catch(InterruptedException e) {
            System.out.println("Главный поток управления прерван");
        }
        System.out.println("Главный поток завершён");
    }
}
