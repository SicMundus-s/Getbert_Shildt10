package Regular;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PaternAndMatcher {
    public static void main(String args[]) {
        String text = "jhon@gmail.com and yandex@mail.ru";

        // Мощный инструмент для работы с текстом
        Pattern pattern = Pattern.compile("(\\w+)@(gmail | mail)\\.(com|ru)"); // Приватный конструктор
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()) { // Возращает true пока находит совпадения в тексте
            System.out.println(matcher.group(1)); // Возращает то, что найдено в тексте с помощью метода find
        }
    }
}
