package Regular;

public class Main {
    public static void main(String args[]) {
        /*
         \\d - одна цифра
         + - один или более
         * - ноль или более
         ? - 0 или 1 символ до

         (x|y|z) - одна строка их множества строк
         (a|b|c) = [abc]
         [0-9] = \\d
         [a-zA-Z] - Все английские буквы
         [^A-Z] - Отрицание(не должно содержать символов)
         . - Любой символ
         \\w - одна буква

         {2] - 2 символа до {\\d{2}})
         {2, } - 2 или более символа (\\d{2,})
         {2, 4} - от 2 до 4 символов
         */
        String a = "-4111";
        String b = "12345";
        String c = "+123345";
        System.out.println(a.matches("(-|\\+)?\\d*")); // Возращает true если строки совпадают.
        System.out.println(b.matches("(-|\\+)?\\d*")); // Возращает true если строки совпадают.
        System.out.println(c.matches("(-|\\+)?\\d*")); // Возращает true если строки совпадают.

        String v = "s3dfs1df12345";
        System.out.println(v.matches("[a-zA-Z31]+\\d+"));

        String e = "Bfgfb";
        System.out.println(e.matches("[^A-Z]*"));

        String url = "http://www.fdgfdg.com";
        System.out.println(url.matches("http://www\\..+\\.(com|ru)"));

        String f = "12";
        System.out.println(f.matches("\\d{2}"));

    }
}
