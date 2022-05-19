package chapter13_InputOutputFile_Assert_TryWithResourses;

/* В этой версии программы ShowFile
        оператор try с ресурсами применяется
        для автоматического закрытия файла
        */
import java.io.*;
public class ShowFilePostJDK9 {
    public static void main(String args[]) {
        int i;

        if(args.length != 2) {
            System.out.println("Использование: CopyFile откуда куда");
            return;
        }
        // Использование try с ресурсами
        try(FileInputStream fin = new FileInputStream(args[0]);
            FileOutputStream fout = new FileOutputStream(args[1])) {
        do {
            i = fin.read();
            if(i != -1) {
                System.out.println((char) i);
                fout.write(i);
            }
        }while(i != -1);
        }catch (IOException e) {
            System.out.println("Ошибка ввода-вывода" + e);
        }

    }
}
