package StreamAPI;

import java.util.*;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String args[]) {
        Stream<Phone> phoneStream = Stream.of(new Phone("iPhone X", "Apple", 600),
                new Phone("Pixel 2", "Google", 500),
                new Phone("iPhone 8", "Apple", 450),
                new Phone("Nokia 9", "HMD Global", 150),
                new Phone("Galaxy S9", "Samsung", 300));

        phoneStream.sorted(new PhomeComporator())
                .forEach(p -> System.out.printf("%s (%s) - %d \n",
                        p.getName(), p.getCompany(), p.getPrice())); // ��������� ������

        //phoneStream.map(p -> "p.getName()" + p.getName() + "p.getCompany()" + p.getCompany()).forEach(p -> System.out.println(p)); // ���������� ��������� ��� ������


        /**
         * // ���������� ������ ���������� �������� ������
         */
        Stream<String> people = Stream.of("Tom", "Bob", "Sam", "Tom", "Alice", "Kate", "Sam");
        people.distinct().forEach(p -> System.out.println(p));


        /**
         * // ���������� ����������� �����
         */
        Stream<String> people1 = Stream.of("Tom", "Bob", "Sam");
        Stream<String> people2 = Stream.of("Alice", "Kate", "Sam");

        Stream.concat(people1, people2).forEach(n -> System.out.println(n));


        /**
         * // Skip - ������� (n) ��������� ������. limit (n) ������ ����������� �� ���-�� ��������� ������
         */
        Stream<String> phoneStream1 = Stream.of("iPhone 6 S", "Lumia 950", "Samsung Galaxy S 6", "LG G 4", "Nexus 7");

        phoneStream1.skip(1)
                .limit(2)
                .forEach(s->System.out.println(s));


        /**
         * count - ���������� ���-�� ��������� � �������
         */
        ArrayList<String> names = new ArrayList<String>();
        names.addAll(Arrays.asList(new String[]{"Tom", "Sam", "Bob", "Alice"}));
        System.out.println(names.stream().count());  // 4

        // ���������� ��������� � ������ �� ������ 3 ��������
        System.out.println(names.stream().filter(n->n.length()<=3).count());  // 3

        /**
         * ����� findFirst() ��������� �� ������ ������ �������, � findAny() ��������� ��������� ������ �� ������ (������� ��� �� ������):
         */

        ArrayList<String> names1 = new ArrayList<>();
        names.addAll(Arrays.asList("Tom", "Sam", "Bob", "Alice"));

        Optional<String> first = names1.stream().findFirst();
        System.out.println(first.get());    // Tom

        Optional<String> any = names1.stream().findAny();
        System.out.println(any.get());    // Tom

        /**
         * boolean allMatch(Predicate<? super T> predicate): ���������� true, ���� ��� �������� ������ ������������� ������� � ���������
         *
         * boolean anyMatch(Predicate<? super T> predicate): ���������� true, ���� ���� ���� ������� ������ ������������� ������� � ���������
         *
         * boolean noneMatch(Predicate<? super T> predicate): ���������� true, ���� �� ���� �� ��������� � ������ �� ������������� ������� � ���������
         */

        ArrayList<String> names2 = new ArrayList<>();
        names.addAll(Arrays.asList("Tom", "Sam", "Bob", "Alice"));

        // ���� �� � ������ ������, ����� ������� ������ 3
        boolean any1 = names2.stream().anyMatch(s->s.length()>3);
        System.out.println(any1);    // true

        // ��� �� ������ ����� ����� � 3 �������
        boolean all = names2.stream().allMatch(s->s.length()==3);
        System.out.println(all);    // false

        // ��� �� � ������ ������ "Bill". ���� ���, �� true, ���� ����, �� false
        boolean none = names2.stream().noneMatch(s->s=="Bill");
        System.out.println(none);   // true

        /**
         * ������ min() � max() ���������� �������������� ����������� � ������������ ��������
         * Optional<T> min(Comparator<? super T> comparator)
         * Optional<T> max(Comparator<? super T> comparator)
         */

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        Optional<Integer> min = numbers.stream().min(Integer::compare);
        Optional<Integer> max = numbers.stream().max(Integer::compare);
        System.out.println(min.get());  // 1
        System.out.println(max.get());  // 9

        /**
         * Optional - ������ ��� ����������� ��������
         * ����� orElse() ��������� ���������� �������������� ��������, ������� ����� ������������, ���� Optional �� ������� �� ������ ������-������ ��������
         * ����� orElseGet() ��������� ������ �������, ������� ����� ���������� �������� �� ���������
         * ��� ���� ����� - orElseThrow ��������� ������������� ����������, ���� Optional �� �������� ��������
         * ����� ifPresent() ���������� �������� �� ��������� � Optional, ���� �������� �������:
         */
        // ������ numbers ������
        ArrayList<Integer> numbersEmpty = new ArrayList<Integer>();
        Optional<Integer> minEmpty = numbersEmpty.stream().min(Integer::compare);
        if(minEmpty.isPresent()) // ���������� true ���� ������ != null
            System.out.println(minEmpty.get());  // java.util.NoSuchElementException

        minEmpty.ifPresent(v -> System.out.println(v));


        /**
         * ����� - collect. ����������� ����� � ������(�������� ������� - toList)
         */

        List<String> phones = new ArrayList<String>();
        Collections.addAll(phones, "iPhone 8", "HTC U12", "Huawei Nexus 6P",
                "Samsung Galaxy S9", "LG G6", "Xiaomi MI6", "ASUS Zenfone 2",
                "Sony Xperia Z5", "Meizu Pro 6", "Lenovo S850");

        List<String> filteredPhones = phones.stream()
                .filter(s -> s.length() < 10).toList();

        for(String s : filteredPhones){
            System.out.println(s);
        }


        /**
         * Group
         */


        Stream<Phone> phoneStream2 = Stream.of(new Phone("iPhone X", "Apple", 600),
                new Phone("Pixel 2", "Google", 500),
                new Phone("iPhone 8", "Apple",450),
                new Phone("Galaxy S9", "Samsung", 440),
                new Phone("Galaxy S8", "Samsung", 340));

        Map<String, List<Phone>> phonesByCompany = phoneStream2.collect(
                Collectors.groupingBy(Phone::getCompany));

        for(Map.Entry<String, List<Phone>> item : phonesByCompany.entrySet()){

            System.out.println(item.getKey());
            for(Phone phone : item.getValue()){

                System.out.println(phone.getName());
            }
            System.out.println();
        }

        /**
         *  parallel
         */

        List<String> people3 = Arrays.asList("Tom","Bob", "Sam", "Kate", "Tim");

        System.out.println("���������������� �����");
        people3.stream().filter(p->p.length()==3).forEach(System.out::println);

        System.out.println("\n������������ �����");
        people3.parallelStream().filter(p->p.length()==3).forEach(System.out::println);
    }
}