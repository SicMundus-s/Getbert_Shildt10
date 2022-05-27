package Collections_InterfaceList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    public static void main(String args[]) {
        List<Integer> linkedList = new LinkedList<>();
        // head -> [5] -> [1] -> [2] -> [3] -> [4]
        // Добавление элемента [5]
        List<Integer> arrayList = new ArrayList<>();

        messureTime(linkedList);
        messureTime(arrayList);
        
    }

    private static void messureTime(List<Integer> list) {

        for(int i = 0; i < 100000; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();

        for(int i = 0; i < 100000; i++) {
            list.get(i);

        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
