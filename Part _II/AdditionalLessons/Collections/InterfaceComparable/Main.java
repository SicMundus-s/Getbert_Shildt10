 package InterfaceComparable;

import java.util.*;

public class Main {
    public static void main(String args[]) {
        List<Person> personList = new ArrayList<>();
        Set<Person> personSet = new TreeSet<Person>();

        addElements(personList);
        addElements(personSet);

        Collections.sort(personList); // Сортировка переданной коллекции
        System.out.println(personList); // Collections - класса от которого наследуются все коллекции
        //Collections.sort(personSet);

    }

    public static void addElements(Collection collection) {
        collection.add(new Person(2, "Katy"));
        collection.add(new Person(1, "Bob"));
        collection.add(new Person(3, "Nikita"));
    }
}

class Person implements Comparable<Person> {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    @Override
   public int compareTo(Person o) {
        return Integer.compare(this.id, o.id);
    }
}