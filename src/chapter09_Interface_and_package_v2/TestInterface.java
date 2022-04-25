package chapter09_Interface_and_package_v2;

public class TestInterface implements abc {

TestInterface() {

}

    @Override
    public int multiplication(int a, int b, int c) {
        return a + b + c;
    }

    public void printABC(int a, int b, int c) {
    System.out.println("a = " + a + "\nb = " + b + "\nc = " + c);
   }
}
