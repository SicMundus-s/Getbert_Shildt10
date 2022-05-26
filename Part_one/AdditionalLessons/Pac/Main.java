package Pac;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
       /* Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(name);

        int matrice[][] = {{3,4,5,6},
                           {7,8,9,10}};*/

        Test test = new Test();
        System.out.println(test.append());
        System.out.println(test);
    }
}
class Test {
    private static int[] array = {1,2,3,4,5};
    private static int x;
    private String name;

    private StringBuilder sb = new StringBuilder("Hello");
    public void print() {
        for(int i =0; i < array.length; i++) {
            System.out.println("Вывод: " + array[i]);
            System.out.println(x);
        }

    }
    public StringBuilder append() {
        return sb.append(" Sonya"); // Конкантенируем строку с помощью StringBuilder.
    }

    @Override
    public String toString() {
        return "myToString";
    }
}