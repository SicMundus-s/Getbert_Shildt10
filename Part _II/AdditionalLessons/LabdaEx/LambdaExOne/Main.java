package LambdaExOne;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface Exectuble {
     int execute(int x, double y);
}

class Runner {
    public void run(Exectuble e) {
        int a = e.execute(10, 10.0);
        System.out.println(a);
    }
}

/*class ExectubleImplementation implements Exectuble {

    @Override
    public void execute() {
        System.out.println("Hello");
    }
}*/

public class Main {
    public static void main(String args[]) {
        Runner runner = new Runner();
//        runner.run(new ExectubleImplementation()); // Первый способ через создание класса
        runner.run(new Exectuble() { // Второй способ - создание ананимного класса имплементиющего интерфейс Exectuble и переопределение метода execute
            @Override
            public int execute(int x, double y) {
                System.out.println("Hello 2");
                return (int) (x + y + 5);

            }
        });

        final int a = 10;
        runner.run((int x, double y) -> { // Нельзя реализовать если в интерфейсе больше одного метода(не является функ.интерфейсом)
            System.out.println("Hello lambda"); // Лямда. Метод без названия. функция(метода) интерфейса Exectuble в классе Runner
            //int a = 11; // У лямды нет своей области видимости
            int b = 5;
            return (int) (x + y + 10 + a);
        });

        List<String> stringList = new ArrayList<>();
        stringList.add("My");
        stringList.add("Bob");
        stringList.add("Nikita");

        stringList.sort((o1, o2) -> {
            if(o1.length() > o2.length()) {
                return 1;
            }else if(o1.length() < o2.length()) {
                return -1;
            }else{
                return 0;
            }
        });
        System.out.println(stringList);
    }
}