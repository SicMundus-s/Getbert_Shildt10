package Regular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitMetohd {
    public static void main(String args[]) {
        String s = "Hello say my name";
        String word[] = s.split(" ");
        System.out.println(Arrays.toString(word));

        String s1 = "Hello say my name";
        String modS1 = s1.replace(" ", ".");
        System.out.println(modS1);




    }
}
