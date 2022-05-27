package Collections_InterfaceList;

import java.util.List;

public class ArrayListTest {
    public static void main(String args[]) {
        // Как и в с++. При удалении элемента создаётся новый массив и все значения из старого переносятся в новый.
        // Так же при заполнении массив постоянно увеличивает свою длину в 2 раза.
        List<Integer> listInt = new java.util.ArrayList<>(); // Конвенция: List = ArrayList

        for(int i = 0; i < 100; i++) {
            listInt.add(i); // Добавить элемент
        }

        System.out.println(listInt); // Вывести элементы (toString)

        System.out.println(listInt.get(50)); // Получить конкретный элемент
        System.out.println(listInt.get(99));

        listInt.remove(50); // Удалить элемент под индексом n
        System.out.println(listInt.get(50));
    }
}
