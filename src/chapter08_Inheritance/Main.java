package chapter08_Inheritance;

public class Main {
    public static void main(String args[]){
        /* Player player = new Player("Jhon", "Archer");
    Inventory inventory = new Inventory("Jjon_1", "Archer", "igla", "Yok", 10, 20);

    Inventory inventory1 = new Inventory();
    inventory1.checkInventory();

    Backpack backpack = new Backpack();
    backpack.checkBackPack(); */

  /*  Player player1 = new Player();
    System.out.println();
    Inventory inventory2 = new Inventory();
    System.out.println();
    Backpack backpack1 = new Backpack();

    Player p; // Ссылка на супер класс Player
    p = player1;
    p.callMe();
    System.out.println();
    p = inventory2;
    p.callMe();
    System.out.println();
    p = backpack1;
    p.callMe(); */

        Abstract a;
        a = new Vlad("Vlad", 20);
        a.printNameAndAge();
        a = new Dima("Dima", 20);
        a.printNameAndAge();
    }
}
