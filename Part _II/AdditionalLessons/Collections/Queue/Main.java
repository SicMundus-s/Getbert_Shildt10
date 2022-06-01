package Queue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    public static void main(String args[]) {
        Person person1 = new Person(1);
        Person person2 = new Person(2);
        Person person3 = new Person(3);
        Person person4 = new Person(4);

        Queue<Person> people = new ArrayBlockingQueue<Person>(5); // First in First out
        people.add(person3);
        people.add(person2);
        people.add(person1);
        people.add(person4);

        System.out.println(people);
        System.out.println(people.remove()); // Без указания значения - удалить первый элемент в очереди
        System.out.println(people.peek()); // Посмотреть первый элемент в очереди

    }
}


class Person {
    private int id;

    public Person(int id) {
        this.id = id;
    }

    @Override
    public String
    toString() {
        return "Person{" +
                "id=" + id +
                '}';
    }
}