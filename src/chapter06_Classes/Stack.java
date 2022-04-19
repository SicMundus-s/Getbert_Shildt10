package chapter06_Classes;

//В этом классе определяется целочисленный стек, где
// можно хранить до 10 целочисленных значений
class Stack {
    int stck[]; // Доступ открыт намеренно
    private int tos;

    Stack(int size) {
        stck = new int[size];
        tos = -1;
    }

    void push(int item) {
        if (tos == stck.length - 1) {
            System.out.println("Стек заполнен");
        } else
            stck[++tos] = item;
    }
        int pop() {
        if(tos < 0) {
            System.out.println("Стек не загружен.");
            return 0;
        }
        else
            return stck[tos--];
        }


}
