package hashcodAndEquals;

import java.util.*;

public class Main {
    public static void main(String args[]) {
        Set<Person> mySet = new HashSet<>();
        Map<Person, String> myMap = new HashMap<>();

       Person person1 = new Person(1, "Mike");
       Person person2 = new Person(1, "Mike");

       myMap.put(person1, "123");
       myMap.put(person2, "123");

        mySet.add(person1);
        mySet.add(person2);

        System.out.println(myMap);
        System.out.println(mySet);
    }
}

class Person {
    private  int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}