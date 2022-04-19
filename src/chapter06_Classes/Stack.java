package chapter06_Classes;

//¬ этом классе определ€етс€ целочисленный стек, где
// можно хранить до 10 целочисленных значений
class Stack {
    int stck[] = new int[10];
    private int tos;

    Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9) {
            System.out.println("—тек заполнен");
        } else
            stck[++tos] = item;
    }
        int pop() {
        if(tos < 0) {
            System.out.println("—тек не загружен.");
            return 0;
        }
        else
            return stck[tos--];
        }


}
