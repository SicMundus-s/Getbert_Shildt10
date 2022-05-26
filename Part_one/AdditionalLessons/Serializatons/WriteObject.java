package Serializatons;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteObject {
    public static void main(String args[]) {
       // Person person = new Person(1, "Jake");
        //Person person1 = new Person(2, "Bob");

        ArrayList<Person> personList = new ArrayList<>() {{
           add(new Person(1, "Jake"));
           add(new Person(2, "Bob"));
           add(new Person(3, "Kaly"));
        }};

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.bin"))) {
           // FileOutputStream fos = new FileOutputStream("people.bin"); // Создание файла
            //ObjectOutputStream oos = new ObjectOutputStream(fos); // Преобразовывает объекты в байты и и записывает их в файл переданный ему аргументом

            oos.writeObject(personList); // Возможен вторый вариант с foreach

        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
