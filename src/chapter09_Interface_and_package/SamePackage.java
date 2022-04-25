package chapter09_Interface_and_package;

public class SamePackage {
    SamePackage() {
        Protection p = new Protection();
        System.out.println("Конструктур класса из того же самого пакета");
        System.out.println("p = " + p.name_pro);
    }
}
