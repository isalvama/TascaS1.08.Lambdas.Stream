package second_level;

import java.util.List;
import java.util.stream.Collectors;

public class SecondLevelMethods {
    public static final String ODD_LETTER = "o";
    public static final String EVEN_LETTER = "e";
    public static final String LETTER_TO_FILTER = "a";

    public static List<String> getNamesStartingWithLetter(List<String> names){
        return names.stream().filter(n -> n.toLowerCase().startsWith(LETTER_TO_FILTER)).toList();
    }

    public static String getStringOfInts (List<Integer> numbers) {
        return numbers.stream().map(n -> (n % 2 == 0 ? EVEN_LETTER : ODD_LETTER) + n).collect(Collectors.joining(", "));
    }
}
