package StreamAPI;

import java.util.Comparator;

public class PhomeComporator implements Comparator<Phone> {
    @Override
    public int compare(Phone a, Phone b) {
        return a.getName().toUpperCase().compareTo(b.getName().toUpperCase());
    }
}
