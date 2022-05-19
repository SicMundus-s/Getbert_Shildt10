package chapter08_Inheritance;

public class Backpack extends Inventory{
    private int backpackVolume = 60;
    private int backpackWeight = potin + arrows;

    Backpack() {
        super();
        System.out.println("Вызво пустого конструктора Backpack");
    }

    Backpack(String name, String mySpecialization, String sword, String bow, int potin, int arrows) {
        super(name, mySpecialization, sword, bow, potin, arrows);
    }

    void checkBackPack(){
        checkInventory();
        System.out.println("вес рюкзака: " + backpackWeight + "/" + backpackVolume);
    }

    void callMe() {
        System.out.println("Вызов метода Backpack");
    }
}
