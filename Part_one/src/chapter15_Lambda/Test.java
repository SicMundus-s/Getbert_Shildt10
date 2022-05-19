package chapter15_Lambda;
    interface StringFunc {
        String func(String n);
    }

    class MyStringOps {
        String strReverse(String str) {
            String result = "";
            int i;
            for (i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        }
    }

    class LambdaAsArgument {
        static String stringOp(StringFunc fc, String n) {
            return fc.func(n);
        }
    }

public class Test {
    public static void main(String args[]) {
        String inStr = "Лямбда-выражения повышают "
                + "эффективность Java"; 
        String outStr;
        // создать объект типа MyStringOps
        MyStringOps strOps = new MyStringOps();
        // А теперь ссылка на метод экземпляра strReverse()
        // передается методу stringOp()
        outStr = LambdaAsArgument.stringOp(strOps::strReverse, inStr);
        System.out.println("Иcxoднaя строка: " + inStr);
        System.out.println("Oбpaщeннaя строка: " + outStr);
    }
}
