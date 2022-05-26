package chapter14_Generalizations;

//Тестирование обобщений
class Gen<T, V> {
    private T value;
    private V value2;
    Gen() {};
    Gen(T val, V val2) {
       value = val;
       value2 = val2;
    }
    void printGen() {
        System.out.println("Value: " + value + "; " + "Value2: " + value2);
    }
    void showType() {
        System.out.println("Типом T является: " + value.getClass().getName());
    }
    T getValue() {
        return value;
    }
}

class Stats<T extends Number> {
    private T[] nums;

    Stats(T[] n) {
        nums = n;
    }


    double average() {
        double sum = 0;
        for(int i = 0; i < nums.length; ++i ) {
            sum += nums[i].doubleValue();
        }
        return sum / nums.length;
    }

    boolean sameAVG(Stats <?> ob) { // <?> Использование метасимвольных аргументов. Обозначает неизвестный тип
        if(average() == ob.average())
            return true;
        return false;
    }

    void printArray(Stats<T> ob) {
        for(int i =0; i < ob.nums.length; i++) {
            System.out.println(ob.nums[i]);
        }
    }

}

class TwoD {
    int x; int y;
    TwoD(int a,int b) {
        x = a;
        y = b;
    }
}
class ThreeD extends TwoD {
    int z;
    ThreeD(int a, int b, int c) {
        super(a, b);
        z = c;
    }
}

class FourD extends ThreeD {
    int t;
    FourD(int a, int b, int c, int d) {
        super(a, b, c);
        t = d;
    }
}

class   Coords<T extends TwoD> {
    T[] coords;

    Coords(T[] o) { coords = o; }

    void showXY() {
        System.out.println("X Y Coordinates: ");
        for(int i = 0; i < coords.length; i++) {
            System.out.println("X:" + coords[i].x + " " +
                    "Y: " + coords[i].y);

        }
    }

    void showXYZ(Coords<? extends ThreeD> c) {
        System.out.println("X Y Z Coordinates: ");
        for(int i = 0; i < c.coords.length; i++) {
            System.out.println("X:" + c.coords[i].x + " " +
                    "Y: " + c.coords[i].y + " " +
                    "Z: " + c.coords[i].z);

        }
    }

    void showXYZT(Coords<? extends FourD> c) {
        System.out.println("X Y Z Coordinates: ");
        for(int i = 0; i < c.coords.length; i++) {
            System.out.println("X:" + c.coords[i].x + " " +
                    "Y: " + c.coords[i].y + " " +
                    "Z: " + c.coords[i].z + " " +
                    "T: " + c.coords[i].t);

        }
    }
}

    
public class Main {
    public static void main(String args[]) {
        Gen ob = new Gen(50, 100);
        ob.printGen();
        Gen<String, Integer> ob2 = new Gen<String, Integer>("String", 100);
        ob2.printGen();
        ob2.showType();


        Integer[] myArray = {1,2,3,4,5};
        Double[] myArrayDouble = {1.0,2.0,3.0,4.0,5.0};
        String[] myArrayString = {"ab", "ac", "ad", "ae", "af"};
        Stats osInt = new Stats(myArray);
        Stats osDouble = new Stats(myArrayDouble);
        // Stats osString = new Stats(myArrayString);


        TwoD td[] = {
                new TwoD(5, 10),
                new TwoD(6, 11),
                new TwoD(7, 12),
                new TwoD(8, 13) };
        Coords<TwoD> tdCord = new Coords<TwoD>(td);
        tdCord.showXY();
        }

    }