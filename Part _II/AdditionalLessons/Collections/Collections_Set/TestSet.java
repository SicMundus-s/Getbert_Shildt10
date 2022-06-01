package Collections_Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {
    public static void main(String args[]) {
        // Не может быть одинаковых элементов
        Set<Integer> hashSet1 = new HashSet<>(); // Нет порядка
        Set<String> linkedHashSet = new LinkedHashSet<>(); // Порядок ввода
        Set<String> treeSet = new TreeSet<>(); // Сортировка(Естестевенный порядок)

        hashSet1.add(0);
        hashSet1.add(1);
        hashSet1.add(2);
        hashSet1.add(3);
        hashSet1.add(4);
        hashSet1.add(5); // Игнорирование


        Set<Integer> hashSet2 = new HashSet<>();

        hashSet2.add(2); hashSet2.add(3); hashSet2.add(4); hashSet2.add(5); hashSet2.add(6); hashSet2.add(7);

        // Методы в Set

        System.out.println(hashSet1.contains(1)); // Выводит true если значение есть в set, иначе false
        System.out.println(hashSet1.contains(3));

        System.out.println(hashSet1.isEmpty());

        //union - объеденение множеств
        Set<Integer> union = new HashSet<>(hashSet1);
        union.addAll(hashSet2); // Добавляются все элементы из двух множеств
        System.out.println(union);

        // intersection - пересечение множеств
        Set<Integer> intersection = new HashSet<>(hashSet1);
        intersection.retainAll(hashSet2); // retain - сохрани/оставь. // Сохраняются только одинаковые элементы двух множеств
        System.out.println(intersection);

        // difference - разность множеств
        Set<Integer> difference = new HashSet<>(hashSet2);
        difference.removeAll(hashSet1); // Удаляются все одинаковые элементы
        System.out.println(difference);

    }

}
