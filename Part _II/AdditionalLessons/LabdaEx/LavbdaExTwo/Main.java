package LavbdaExTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String args[]) {
        int[] arr = new int[10];
        List<Integer> list = new ArrayList<>();

        fillArr(arr);
        fillList(list);

        System.out.println(Arrays.toString(arr));
        System.out.println(list);

        // Умножим все элементы в массиве и листе с помощью лямды. Map method
        arr = Arrays.stream(arr).map(a -> a * 2).toArray(); // Преобразуется в тип данных stream(поток) и после обратно в массив
        list = list.stream().map(a -> a * 2).toList(); // Map преобразует элементы

        System.out.println(Arrays.toString(arr));
        System.out.println(list);

        // filter method

        arr = Arrays.stream(arr).filter(a -> a % 2 == 0).toArray(); // филтер отбирает элементы по заданным критериям
        list = list.stream().filter(a -> a % 5 == 0).toList();

        System.out.println(Arrays.toString(arr));
        System.out.println(list);

        // forEach method
        Arrays.stream(arr).forEach(System.out::println);
        list.stream().forEach(a -> System.out.println(a));

        // reduce(Сжимание)
        int sum = Arrays.stream(arr).reduce((acc, b) -> acc + b).getAsInt(); // Сжимает массив в одно число(сумма всех элементов)
        int sum2 = list.stream().reduce((acc, b) -> acc * b).get();

        // Так же можно вызывать очередь методов
        list = list.stream().filter(a -> a != 0).map(a -> a * 2).toList(); // В данном случае мы филтруем все элементы массива
        // И после с помощью map выводим хи умноженными на 2
        System.out.println(list);
    }

    private static void fillList(List<Integer> list) {
        Random random = new Random();
        for(int i = 0; i < 10; i++ ) {
            list.add(random.nextInt(10));
        }
    }

    private static void fillArr(int[] arr) {
        Random random = new Random();
        for(int i = 0; i < arr.length; i++ ) {
            arr[i] = random.nextInt(10);
        }
    }
}
