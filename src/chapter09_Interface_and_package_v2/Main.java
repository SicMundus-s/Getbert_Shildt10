package chapter09_Interface_and_package_v2;

public class Main {

    public static void main(String[] args) {
    Test t = new Test();

    TestInterface TI = new TestInterface();

    TI.printABC(5, 10, 15);
    int i = TI.multiplication(5, 10, 15);
    System.out.println(i);

    TI.Exception();
    CallMe.answer(TI.Exception());

    }

}
