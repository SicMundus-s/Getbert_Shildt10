package chapter10_Exceptions;

class FinallyDemo{
    void procA()
    {
        try {
            System.out.println("В теле метода procA");
            throw new RuntimeException("RunTime");
        }catch (RuntimeException e) {
            System.out.println(e);
        }
    }
    void procAB()
    {
        try {
            System.out.println("В теле метода procA");
            throw new RuntimeException("RunTime");
        }finally {
            System.out.println("Тело finally в методе procAB ");
        }
    }
    void procB() {
        try {
            System.out.println("В теле метода procB");
            return;
        }finally {
            System.out.println("Выполнение блок finally в методе procB");
        }
    }
    void procC() {
        try {
            System.out.println("В теле метода procC");
        }finally {
            System.out.println("finally в теле метода procC");
        }

    }
}

class myExcepation extends Exception {
    private int detail = 0;

    myExcepation(int a) {
        detail = a;
    }
    public String toString() {
        return "MyException [" + detail + "] ";
    }
}

class ExceptionDemo {
    static void compute(int a) throws myExcepation {
        System.out.println("Bызвaн метод compute(" + a + ")");
        if (a > 10)
            throw new myExcepation(a);
        System.out.println("Hopмaльнoe завершение");
    }
}

class MultipleInterception {
    void multiple() {
        try {

        int a = 0;
        int b = 50/a;
        int myArray[] = new int[5];
        myArray[55] = 55;
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Перехват исключения:" + e);
        }
        System.out.println("После перехвата исключения");
    }
}

public class Main {
    public static void main(String[] args) {
        /*FinallyDemo fd = new FinallyDemo();
        fd.procA();
        fd.procB();
        fd.procC();
        try {
            fd.procAB();
        }catch (RuntimeException e) {
            System.out.println("Исключение перехваченно");
        }

        try {
            ExceptionDemo.compute(5);
            ExceptionDemo.compute(11);
        }catch (myExcepation a) {
            System.out.println(a);
        }
        */

        MultipleInterception mi = new MultipleInterception();
        mi.multiple();
     }
}


// try - блок кода
// catch - Перехватчик ислкючений
// Finally - выполняется при завершении блока try(Если нужно закрыть файл или продолжить выполнение после блока try)
// throw - Генерания исключений
