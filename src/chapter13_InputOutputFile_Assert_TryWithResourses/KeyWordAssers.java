package chapter13_InputOutputFile_Assert_TryWithResourses;

public class KeyWordAssers {

    static int x = 10;

    static int getnum() {
        return --x;
    }
    public static void main(String args[]) {

        int n;

        while(true) {
        System.out.println("x: " + x);
        n = getnum();
        assert n > 0 : "n отрицательное!";
      }
    }
}
