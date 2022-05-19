package chapter15_Lambda;

interface MyFunc<T> {
    int func(T[] vals, T v);
}

class MyArrayOps {
    static <T> int countMatching(T[] vals, T v) {
        int counter = 0;
        for(int i =0; i < vals.length; i++) {
            if(vals[i] == v) counter++;
        }
        return counter;
    }
}

public class GenericMethodRefDemo {
    static <T> int myOp(MyFunc <T> f, T[] vals, T v) {
        return f.func(vals, v);
    }
}

class TestGeneric {
    static void rez() {
    Integer[] vals = {1,2,3,4,5};
    String[] strs = {"Один", "Два", "Три", "Два"};
    int count;

    count = GenericMethodRefDemo.myOp(MyArrayOps::<Integer>countMatching, vals, 4);
    }
}