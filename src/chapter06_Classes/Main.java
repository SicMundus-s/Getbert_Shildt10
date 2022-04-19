package chapter06_Classes;

public class Main {
    public static void main(String args[]) {

        Box myBox = new Box(1.0, 2.0, 3.0);
        System.out.println(myBox.volume());

        Stack myStack = new Stack(10);

        // myStack.pop();

        for(int count = 0; count < myStack.stck.length; ++count) {
            myStack.push(count);
        }
        /*for(int x : myStack.stck) {
            System.out.println(x);
        } */
        for(int count = 0; count < myStack.stck.length; ++count){
            System.out.println(myStack.pop());
        }

    }

}
