package chapter08_Inheritance;

 class Player {
    private String name;
    private String mySpecialization;


    Player() {
    name = "Default";
    mySpecialization = "Non";
    System.out.println("Вызво пустого конструктора Player");
    }

    Player(Player p) {
       name = p.name;
       mySpecialization = p.mySpecialization;
    }
    Player(String name, String mySpecialization) {
    this.name = name;
    this.mySpecialization = mySpecialization;
    }

    void checkPlayer() {
        System.out.println("имя: " + name + " " + "Специализация:" + mySpecialization);
    }

    void callMe() {
       System.out.println("Вызов метода Player");
    }

}

