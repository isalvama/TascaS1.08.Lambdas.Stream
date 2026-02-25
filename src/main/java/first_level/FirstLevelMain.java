package first_level;

import java.util.Arrays;
import java.util.List;

public class FirstLevelMain {
    public static void main (String[] args){
        List<String> words = Arrays.asList("hello", "how", "are", "you");

        // Exercise 1
        System.out.println("Result of getWordsWithO method: " + FirstLevelMethods.getWordsWithLetter(words));

        // Exercise 2
        System.out.println("Result of getWordsWithOAnFiveLetters method: " + FirstLevelMethods.getWordsWithLetterAndNumLetters(words));

        // Exercise 3
        FirstLevelMethods.printStringList(words);

        // Exercise 4
        FirstLevelMethods.referPrintStringList(words);

        // Exercise 5
        PiValue piValue1 = () -> 3.1415;
        System.out.println("getPiValue: " + piValue1.getPiValue());

        List<Object> objectList = Arrays.asList(3, "hello", 4, "Natalia", 15, "are", "you", 0, "ok");

        // Exercise 6
        System.out.println("Result of sortElementsByAscendingLength method: " + FirstLevelMethods.sortElementsByAscendingLength(objectList));

        // Exercise 7
        System.out.println("Result of sortElementsByDescendingLength method: " + FirstLevelMethods.sortElementsByDescendingLength(objectList));

        // Exercise 8
        StringReverse reverser1 = (str) -> new StringBuffer().append(str).reverse().toString();
        System.out.println(reverser1.reverse("Hello world!"));
        System.out.println(reverser1.reverse("How are you?"));
    }
}
