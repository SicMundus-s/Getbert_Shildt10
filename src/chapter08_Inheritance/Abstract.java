package chapter08_Inheritance;

abstract public class Abstract {
    int age;
    String name;

    public Abstract(String name, int age) {
        this.age = age;
        this.name = name;
    }

    void printNameAndAge () {
        System.out.println("My name is a: " + name + " and i am: " + age + " years old");
    }

    final void testPrint() {
        System.out.println("test final");
    }

}

class Vlad extends Abstract {
    Vlad(String name, int age) {
        super(name, age);
    }

    @Override
    void printNameAndAge() {
        System.out.println("My name is a: " + name + " and i am: " + age + " years old");
    }

}

class Dima extends  Abstract {
    Dima(String name, int age) {
        super(name,age);
    }

    @Override
    void printNameAndAge() {
        super.printNameAndAge();
        //System.out.println("My name is a: " + name + " and i am: " + age + " years old");
    }
}