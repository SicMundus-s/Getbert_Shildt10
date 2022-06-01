package Stack;

import java.util.Stack;

public class Main {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>(); // Last in First out
        stack.push(5);
        stack.push(3);
        stack.push(1);

        System.out.println(stack.pop()); // Извлечь элемент из стека
        System.out.println(stack.pop());
        System.out.println(stack.peek()); // Посмотреть на элемент
    }
}
