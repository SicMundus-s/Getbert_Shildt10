package Serializatons;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class ReadObject {

    public static void main(String args[]) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people.bin"))){
            //FileInputStream fis = new FileInputStream("people.bin");
            //ObjectInputStream ois = new ObjectInputStream(fis);

            Person peolpe = (Person) ois.readObject(); // ???

            System.out.println(peolpe);
           // ois.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
