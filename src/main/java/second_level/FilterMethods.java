package second_level;

import java.util.Comparator;

public class FilterMethods {
    private static final int INDEX_LETTER_TO_FILTER = 0;
    private static final String LETTER_TO_FILTER = "e";
    private static final String LETTER_TO_BE_REPLACED = "a";
    private static final String NUMBER_TO_REPLACE = "4";

    public static final Filter ALPHABETICALLY_SORTED_FILTER = list -> list.stream().filter(elem -> elem instanceof String).map(String.class::cast).sorted(Comparator.comparingInt(str -> str.charAt(INDEX_LETTER_TO_FILTER))).toList();
    public static final Filter SORT_LIST_WITH_WORDS_STARTING_WITH_LETTER = list -> list.stream().filter(elem -> elem instanceof String).map(String.class::cast)
            .sorted(Comparator
                    .comparing((String s) -> !s.toLowerCase().startsWith(LETTER_TO_FILTER))
                    .thenComparing(String::compareToIgnoreCase))
            .toList();
    public static final Filter  REPLACE_LETTER_FOR_NUMBER = list -> list.stream().filter(elem -> elem instanceof String).map(String.class::cast).map(str -> str.replace(LETTER_TO_BE_REPLACED, NUMBER_TO_REPLACE)).toList();
    public static final Filter  NUMBER_FILTER = list ->  list.stream().filter(elem -> elem instanceof Integer).toString().lines().toList();

}
