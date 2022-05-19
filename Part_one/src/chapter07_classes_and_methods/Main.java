package chapter07_classes_and_methods;

public class Main {
    public static void main(String args[])
    {
        // Тестирование конструкторов и методов
        Test ob0 = new Test();
        Test ob1 = new Test(1, 2);
        Test ob2 = new Test(1, 2);
        Test ob3 = new Test(ob1);
        //ob3 = ob1; ???

        System.out.println("ob1 == ob2: " + ob1.equalTo(ob2));
        System.out.println("ob: " + ob0);
        System.out.println("0b1: " +ob1+ "\nob3: " + ob3);

        // Рекурсия. Факториал
        Factorial f = new Factorial();
        System.out.println(f.fact(5));

        // Статические переменные, методы и блоки
        UseStatic sta = new UseStatic();
        //UseStatic.meth(50);
        sta.meth(50);
    }
}
class Test {
    private int a, b;

    Test() {};
    Test(int a, int b) {
        this.a = a;
        this.b = b;
    }
    Test(Test ob) {
        a = ob.a;
        b = ob.b;
    }

    // возвратить логическое значение true, если в
    // качестве параметра о указан вызывающий объект
    boolean equalTo(Test obj) {
        if (obj.a == a && obj.b == b) return true;
        else return false;
    }

}

class Factorial {
    int fact(int n) {
        if(n == 1) return 1;
        int temp = fact(n - 1) * n;
        return temp;

    }
}

class UseStatic {
    final static int a = 10;
    static int b = 20;

    static void meth(int x) {
        System.out.println("x: " + x);
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    static {
        System.out.println("Вызов статического блок");
        b *= 10;
    }
}