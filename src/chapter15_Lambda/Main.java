package chapter15_Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Main {
        private static class Student {
        final private int age;
        final private String name;

        private Student(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    public static void main(String args[]) {
        final List<Student> students = new ArrayList<>() {{
            add(new Student(36, "Vladd"));
            add(new Student(37, "B"));
            add(new Student(38, "C"));
            add(new Student(39, "D"));
            add(new Student(40, null));
        }};

        int counter = 0;
        for(Student student : students) {
            if(student.age > 30 & (student.name == null || student.name.length() < 4)) {
                counter++;
            }
        }
        System.out.println(counter);

        long count = students.stream()
                .filter(student -> student.getAge() > 30)
                .map(Student::getName)
                .filter(name -> name == null || name.length() < 4)
                .count();

        System.out.println(count);

        iSum sum = (a, b) -> a + b;
        ISqrt sqrt = (x) -> Math.sqrt(x);

        // Это блочное лямбда-выражение вычисляет факториал
        // целочисленного значения. Для этой цели на сей раз
        // используется функциональный интерфейс Function
        Function<Integer, Integer> factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++)
                result = i * result;
            return result;
        };
        System.out.println(factorial.apply(5));
    }
    @FunctionalInterface
    public interface iSum {
        public int sum(int a, int b);
    }
    @FunctionalInterface
    public interface ISqrt {
        public double sqrt(double x);

    }
}
