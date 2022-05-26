package Enum;

public enum Animal {
    DOG("Собка"), // Объекты класса Animal (Object -> Enum -> Animal)
    CAT("Кошка"),
    FROG("Ляшушка");

    private String translation;

    Animal() {

    }
    private Animal(String translation) { // Возможен конструктор
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "translation='" + translation + '\'' +
                '}';
    }
}
