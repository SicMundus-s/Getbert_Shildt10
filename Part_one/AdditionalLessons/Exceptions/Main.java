package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

// Исключения в джава делятся на:
// Checked Exception(Compile time exception)
// Unchecked Exception(Runtime exception) int a = 1/0 String / name = null / array[1];
public class Main {
    public static void main(String args[]) {
        File file = new File("avd");
        Scanner scannerInt = new Scanner(System.in);
        try {
            Scanner scanner = new Scanner(file);
        }catch (FileNotFoundException e) {
            System.out.println("File not found"); // User frendly Обработка исключений
        }

        int x = scannerInt.nextInt();
        if(x == 0 ) {
            try {
                throw new IOException(); // Выбрасываем исключение
            } catch (IOException e) {
                System.out.println("Введён ноль");
            }
        }
       System.out.println("Post try/catch");
    }

    // В одном методе можно выбрасывать много исключений
    public static void run() throws IOException, ArrayIndexOutOfBoundsException, FileNotFoundException { // Возможна обработка нескольких исключений

    }
}
