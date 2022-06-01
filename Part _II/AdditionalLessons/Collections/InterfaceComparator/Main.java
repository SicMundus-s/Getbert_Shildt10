package InterfaceComparator;

import java.util.*;

public class Main {
    public static void main(String args[]) {
        List<String> animals = new ArrayList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("a");
        animals.add("Duck");

        Collections.sort(animals, new StringLenghtComparator());
        System.out.println(animals);
        Collections.sort(animals, new Comparator<String>() {
            @Override //Анонимный класс
            public int compare(String o1, String o2) {
                if(o1.length() > o2.length()) {
                    return 1;
                }else if(o1.length() < o2.length()) {
                    return -1;
                }else {
                    return 0;
                }
            }
        });

        List<Person> personList = new ArrayList<>();
        personList.add(new Person(2, "Katya"));
        personList.add(new Person(1, "Bob"));
        personList.add(new Person(3, "Vlad"));

        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if(o1.getId() > o2.getId())
                    return 1;
                else if(o1.getId() < o2.getId()) {
                    return -1;
                }else
                    return 0;
            }
        });
        System.out.println(personList);
    }
}

class StringLenghtComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        /* // Конвенция
        o1 > o2 => 1
        o1 < o2 => -1
        o1 == o2 => 0

        compare(2, 1) => 1

         */
        if(o1.length() > o2.length()) {
            return 1;
        }else if(o1.length() < o2.length()) {
            return -1;
        }else {
            return 0;
        }
    }
}

class Person {
    private int id;
    private String name;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}