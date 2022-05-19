package chapter16_Modules.TestMathFuncs;

import chapter16_Modules.mymodappdemo.SimpleMathFunc;
import static chapter16_Modules.mymodappdemo.SimpleMathFunc.lcf;

public class Main {
    public static void main(String args[]) {
        int x = SimpleMathFunc.lcf(10,10);
        lcf(20, 20);
        System.out.println(x);
        System.out.println(SimpleMathFunc.gcf(20,10));
    }
}
