package first_level;

import java.util.Comparator;
import java.util.List;

public class FirstLevelMethods {

    public static List<String> getWordsWithO(List<String> wordList){
        return wordList.stream().filter(fr -> fr.contains("o")).toList();
    }

    public static List<String> getWordsWithOAnFiveLetters(List<String> wordList){
        return wordList.stream().filter(fr -> (fr.contains("o")) && (fr.length() == 5)).toList();
    }

    public static void printStringList (List<String> stringList){
        stringList.stream().forEach(str -> System.out.println(str));
    }

    public static void referPrintStringList(List<String> stringList){
        stringList.forEach(System.out::println);
    }

    public static List<String> sortElementsByDescendingLength(List<Object> elementList){
        return elementList.stream().filter(elem -> elem instanceof String).map(String.class::cast).sorted(Comparator.comparingInt(String::length)).toList();
    }

    public static List<String> sortElementsByAscendingLength(List<Object> elementList){
        return elementList.stream().filter(elem -> elem instanceof String).map(String.class::cast).sorted((o1, o2) -> o2.length() - o1.length()).toList();
    }
}
