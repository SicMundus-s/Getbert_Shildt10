package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.IntPredicate;
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
                        p.getName(), p.getCompany(), p.getPrice())); // Сортирует массив

        //phoneStream.map(p -> "p.getName()" + p.getName() + "p.getCompany()" + p.getCompany()).forEach(p -> System.out.println(p)); // Возвращает изменённый вид потока


        /**
         * // Возвращает только уникальные элементы потока
         */
        Stream<String> people = Stream.of("Tom", "Bob", "Sam", "Tom", "Alice", "Kate", "Sam");
        people.distinct().forEach(p -> System.out.println(p));


        /**
         * // Возвращает объединённый поток
         */
        Stream<String> people1 = Stream.of("Tom", "Bob", "Sam");
        Stream<String> people2 = Stream.of("Alice", "Kate", "Sam");

        Stream.concat(people1, people2).forEach(n -> System.out.println(n));


        /**
         * // Skip - скипает (n) элементов потока. limit (n) ставит ограничения на кол-во элементов потока
         */
        Stream<String> phoneStream1 = Stream.of("iPhone 6 S", "Lumia 950", "Samsung Galaxy S 6", "LG G 4", "Nexus 7");

        phoneStream1.skip(1)
                .limit(2)
                .forEach(s->System.out.println(s));


        
    }
}
