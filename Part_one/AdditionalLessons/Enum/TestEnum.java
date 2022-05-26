package Enum;

public class TestEnum {
    public static void main(String args[]) {
        Animal cat = Animal.CAT;
        System.out.println(cat.ordinal()); // Индекс cat
        System.out.println(cat.getTranslation());
        System.out.println(cat); // toString
    }
}
