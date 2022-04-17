package chapter04_Boolean_operations;

class Main {
    public static void main(String args[]) {    // Продемонстрировать применение поразрядных логических операций

        String binary[] = {
                "0000", "0001", "0010", "0011", "0100", "0101",
                "0110", "0111", "1000", "1001", "1010", "1011",
                "1100", "1101", "1110", "1111"
        };
        int a = 3;
        int b = 6;
        int c = a | b; // Побитовая или
        int d = a & b;// Побитовая и
        int e = a ^ b; // Побитовая иск.или
        int f = (~a & b) | (a & ~b);
        int g = ~a & 0x0f;
        int h = 32;
        int j = h << 2; // Сдвиг влево
        int k = h >> 2; // Сдвиг вправо
        System.out.println(" a = " + binary[a]);
        System.out.println(" b = " + binary[b]);
        System.out.println(" a | b " + binary[c]);
        System.out.println(" a & b " + binary[d]);
        System.out.println(" a ^ b " + binary[e]);
        System.out.println(" ~a & b| a &~b = " + binary[f]);
        System.out.println(" ~a= " + binary[g]);
        System.out.println(" h = " + h);
        System.out.println(" h << 2" + j);
        System.out.println(" h >> 2" + k);

        LogicOperation logic = new LogicOperation();
        logic.test(true, false);
    }
}


