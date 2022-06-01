package Collections_InterfaceMap;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
    public static void main(String args[]) {
        // HashMap не гарантирует вывод по порядку из-за хэш значений. Вывод может отличатся с каждым запуском программы
        Map<Integer, String> integerStringMap = new HashMap<>(); // Пара: ключ-значение
        integerStringMap.put(1, "Один");
        integerStringMap.put(2, "Два");
        integerStringMap.put(3, "Три");

        System.out.println(integerStringMap);

        integerStringMap.put(3, "Другое значение для ключа три");
        System.out.println(integerStringMap);

        for(Map.Entry<Integer, String> entry : integerStringMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
