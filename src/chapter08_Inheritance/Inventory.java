package chapter08_Inheritance;

public class Inventory extends Player {
    private String sword;
    protected int potin;
    private String bow;
    protected int arrows;

    Inventory() {
        super();
        sword = "Sword";
        potin = 0;
        bow = "Bow";
        arrows = 0;
        System.out.println("Вызво пустого конструктора Inventory");
    }
    Inventory(Inventory in) {
        super(in);
        sword = in.sword;
        potin = in.potin;
        bow = in.bow;
        arrows = in.arrows;
    }

    Inventory(String name, String mySpecialization, String sword, String bow, int potin, int arrows) {
        super(name, mySpecialization);
        this.sword = sword;
        this.bow = bow;
        this.potin = potin;
        this.arrows = arrows;
    }

    void checkInventory() {
        System.out.println("меч: " + sword + "\nколличество зелья здоровья: " + potin);
        System.out.println("лук: " + bow + "\nколличество стрел: " + arrows);
    }

    void callMe() {
        System.out.println("Вызов метода Inventory");
    }

}
