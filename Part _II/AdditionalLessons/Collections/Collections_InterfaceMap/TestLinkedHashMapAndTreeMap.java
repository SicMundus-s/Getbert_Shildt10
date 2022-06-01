package Collections_InterfaceMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestLinkedHashMapAndTreeMap {
    public static void main(String args[]) {

    Map<Integer, String> linkMap = new LinkedHashMap<>(); // В отличие от hashMap гарантируется порядок ключ-значение.
    Map<Integer, String> treeMap = new TreeMap<>(); // Горантирует сортировку по ключу(естественный порядок)

     testMap(linkMap);
     System.out.println("*************  ");
     testMap(treeMap);
    }

    public static void testMap(Map<Integer, String> map) {
        map.put(1, "BOB");
        map.put(10, "Mike");
        map.put(0, "Garry");
        map.put(1000, "Jake");
        map.put(7, "Mike");

        for(Map.Entry<Integer, String> entry : map.entrySet() ) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

