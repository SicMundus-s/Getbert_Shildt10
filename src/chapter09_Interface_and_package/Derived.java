package chapter09_Interface_and_package;

class Derived extends Protection {
    Derived() {
        System.out.println("Конструктор подкласс");
        System.out.println("x = " + x);
        System.out.println("y_pub = " + y_pub);
        System.out.println("name_pro = " + name_pro);
    }

}
