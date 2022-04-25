package chapter09_Interface_and_package;

public class Protection {
    int x = 10;
    public int y_pub = 20;
    protected String name_pro = "Nikita";
    private int z_pri = 30;

    public Protection() {
        System.out.println("Конструктор супер класса");
        System.out.println("x = " + x + "\n" + "y_pub =" + y_pub + "\n" + "name_pro: " + name_pro + "\n" + "z_pri = " + z_pri);
    }
}
