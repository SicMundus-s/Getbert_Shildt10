package chapter12_enumerations_autoboxing_and_annotations;

enum Apple {
    Jonathan(10), GoldenDel(15), RedDel(20), Winesap(25), Cortland(30);
    private int price;
    Apple(int p) {price = p;}
    public int getPrice() {return price;}

}

public class Main {
    public static void main(String args[]) {

        int i = 0;
        Integer im = 100;
        i = im;
        System.out.println(i);
        Apple ap;
        ap = Apple.valueOf("GoldenDel");

        for(Apple a : Apple.values()) {
            System.out.println(a + "стои " + a.getPrice() + " юаний");
        }

        System.out.println(ap);
    }
}

