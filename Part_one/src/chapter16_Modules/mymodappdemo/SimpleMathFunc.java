package chapter16_Modules.mymodappdemo;

import static java.lang.Math.abs;

public class SimpleMathFunc {
    // выяснить, является пи а множителем Ь
    public static boolean isFactor(int a, int b) {
        if ((b % a) == 0) return true;
        return false;
        // возвратить наименьший общий для а и Ь
        //положительный множитель
    }

    public static int lcf(int a, int b) {
        // получить абсолютные значения
        a = abs(a); // Импортивонный статический метод .abc
        b = Math.abs(b);
        int min = a < b ? a : b;
        for (int i = 2; i <= min / 2; i++) {
            if (isFactor(i, a) && isFactor(i, b))
                return i;
        }
        return 1;
    }

    // возвратить наибольший общий для а и Ь
    // положительный множитель
      public static int gcf(int a, int b) {
        // получить абсолютные значения
        a = Math.abs(a);
        b = Math.abs(b);
        int min = a < b ? a : b;
        for (int i = min / 2; i >= 2; i--) {
            if (isFactor(i, a) && isFactor(i, b))
                return i;
        }
        return 1;
    }
}
