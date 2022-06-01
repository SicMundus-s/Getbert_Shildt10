package InterfaceIterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);myList.add(3);

        Iterator<Integer> iterator = myList.listIterator();

        int idx = 0;
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
            if(idx == 1) {iterator.remove(); } // Удаление элемента
            idx++;
        }

        for(int x : myList) {
            System.out.println(x);
        }

    }
}
