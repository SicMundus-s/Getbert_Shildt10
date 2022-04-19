package chapter06_Classes;

public class Main {
    public static void main(String args[]) {

        Box myBox = new Box(1.0, 2.0, 3.0);
        System.out.println(myBox.volume());

        Stack myStack = new Stack();

        myStack.pop();

        for(int count = 0; count < 10; ++count) {
            myStack.push(count * 2);
        }
        for(int x : myStack.stck) {
            System.out.println(x);
        }
        for(int count = 0; count < 10; ++count){
            System.out.println(myStack.pop());
        }

    }

}
