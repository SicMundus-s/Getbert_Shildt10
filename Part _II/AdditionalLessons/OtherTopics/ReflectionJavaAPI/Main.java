package ReflectionJavaAPI;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Class personClass = Person.class; // Рефлексия - воспринимаем класс Person как объект класса Class.

        /*Method[] methods = personClass.getMethods();
        for(Method method : methods) {
            System.out.println(method.getName() + ", " + method.getReturnType() +
                    ", " + Arrays.toString(method.getParameterTypes()));
        }*/

        Field[] fields =  personClass.getDeclaredFields(); // Получаем все поля класса Person, включая private
        for(Field field : fields) {
            System.out.println(field.getName() + ", " + field.getType());
        }

        Annotation[] annotations = personClass.getAnnotations();
        for(Annotation annotation : annotations) {
            if(annotation instanceof Author) { // Если является экземпляром аннотации автор
                System.out.println("Yes");
            }
            System.out.println(annotation);



            Scanner scanner = new Scanner(System.in);
            Class classOj = Class.forName(scanner.next());
            Class classOb2 = Class.forName(scanner.next());
            String methodName = scanner.next();

            Method m = classOj.getMethod(methodName, classOb2);
            Object o1 = classOj.newInstance();
            Object o2 = classOb2.getConstructor(String.class).newInstance("String value");

            m.invoke(o1, o2);
        }
    }
}
