package chapter12_enumerations_autoboxing_and_annotations;

import java.lang.reflect.*;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface myAnno {
    String name();
    int val();
    boolean lazyload() default false;
}

public class Annotations {
    @myAnno(name = "пример аннотации", val = 100)
    public static void testAnno () {
        Annotations an = new Annotations();

        try {
            Class<?> c = an.getClass();

            Method m = c.getMethod("MyMeth");

            myAnno anno =  m.getAnnotation(myAnno.class);

            System.out.println(anno.name() + " " + anno.val());
        }catch (NoSuchMethodException exc) {
            System.out.println("Метод не найден");
        }
    }
}
