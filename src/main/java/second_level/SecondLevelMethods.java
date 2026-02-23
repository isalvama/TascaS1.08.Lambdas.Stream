package second_level;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLevelMethods {

    public static List<String> getNamesStartingWithA (List<String> names){
        return names.stream().filter(n -> n.startsWith("A")).toList();
    }

    public static String getStringOfInts (List<Integer> numbers) {
        StringBuilder sb = new StringBuilder();
        return numbers.stream().map(n -> (n % 2 == 0 ? "e" : "o") + n).collect(Collectors.joining(", "));
    }

    public static List<Object> getSortedList (List<Object> elementList) {
        StringBuilder sb = new StringBuilder();
        // TODO Les cadenes que contenen una "e" primer, la resta de cadenes després. Posa el codi directament a la lambda.
        elementList.stream().filter(elem -> elem instanceof Integer).forEach(System.out::println);
        List<String> sortedList = elementList.stream().filter(elem -> elem instanceof String).map(String.class::cast).sorted(Comparator.comparingInt(str -> ((String) str).charAt(0))).toList();
        return Collections.singletonList(sortedList.stream().filter(elem -> elem instanceof String).map(String.class::cast).map(str -> str.replace("a", "4")).toList());
    }
}
