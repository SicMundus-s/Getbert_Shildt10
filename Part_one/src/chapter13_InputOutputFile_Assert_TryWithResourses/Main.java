package chapter13_InputOutputFile_Assert_TryWithResourses;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        String str[] = new String[100];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true); // Упращает интернационализацию программ
        pw.println("Stroka");

        System.out.println("Введите строки. введите 'stop' для выхода.");
            for(int i = 0; i < 100; ++i) {
                str[i] = br.readLine();
                if(str[i].equals("stop")) break;
            }

            System.out.println("Ваши введёные строки))");
            for(String s : str) {
                if(s.equals("stop")) break;
                System.out.println(s);
            }
    }
}
