package chapter13_InputOutputFile_Assert_TryWithResourses;

import java.io.*;
// Данная программа использует метод close, актуальный способ работы с файлами до версии JDK 7.
public class ShowFile {
    public static void main(String args[]) {
        int i;
        FileInputStream fis = null;

        // Убедится что имя файла указано
        if(args.length != 2) {
            System.out.println("Использование: ShowFile имя_файла:  ");
            return;
        }
        /* try {
            fis = new FileInputStream(args[0]);
        }catch(FileNotFoundException e) {
            System.out.println("Неудалось открыть файл");
            return;
        }

         */

        try {
            fis = new FileInputStream(args[0]);
            do {
                i = fis.read();
                if (i != -1) System.out.println((char) i);
            } while (i != -1);
       // }catch (FileNotFoundException e) {  // FileNot... является производным от класса IOEx..
         //   System.out.println("Файл не найден");
        }catch (IOException e) { // Поэтому можно сделать следующим образом и обработать 2 ошибки (Нет файла и ошибка ввода)
            System.out.println("Ошибка ввода-вывода" + e);
        }finally {
            try{
            //fis.close();
                if(fis != null) fis.close();
            }catch (IOException e) {
                System.out.println("Ошибка закрытия файла");
            }

        }
        /*
        try {
            fis.close();
        }catch (IOException e) {
            System.out.println("Ошибка закрытия файла");
        }
         */
    }
}
