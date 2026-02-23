package first_level;

import java.util.Arrays;
import java.util.List;

import static first_level.StringReverse.SB;

public class FirstLevelMain {
    public static void main (String[] args){
        List<String> words = Arrays.asList("hello", "how", "are", "you");
        System.out.println(FirstLevelMethods.getWordsWithO(words));
        System.out.println(FirstLevelMethods.getWordsWithOAnFiveLetters(words));
        FirstLevelMethods.printStringList(words);
        FirstLevelMethods.referPrintStringList(words);
        PiValue piValue1 = () -> 3.1415;
        System.out.println(piValue1.getPiValue());

        List<Object> objectList = Arrays.asList(3, "hello", 4, "Natalia", 15, "are", "you", 0, "ok");
        System.out.println(FirstLevelMethods.sortElementsByDescendingLength(objectList));
        System.out.println(FirstLevelMethods.sortElementsByAscendingLength(objectList));

        StringReverse reverser1 = (str) -> SB.append(str).reverse().toString();

        System.out.println(reverser1.reverse("Hello"));
    }
}
