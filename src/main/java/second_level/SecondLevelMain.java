package second_level;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLevelMain {

    public static void main (String[] args){
        final int INDEX_LETTER_TO_FILTER = 0;
        final String LETTER_TO_FILTER = "e";
        final String LETTER_TO_BE_REPLACED = "a";
        final String NUMBER_TO_REPLACE = "4";


        // Exercise 1
        List<String> names = Arrays.asList("Laura", "Alba", "Joe", "Albert", "Darien", "Ana", "Aura");
        System.out.println("Result of getNamesStartingWithA method: " + SecondLevelMethods.getNamesStartingWithLetter(names));

        // Exercise 2
        System.out.println("Result of getNamesStartingWithA method: " + SecondLevelMethods.getStringOfInts(Arrays.asList(1, 2, 3, 4, 5, 72, 0, 190)));

        // Exercise 3
        Operation addOperation = Integer::sum;
        Operation susbtractOperation = Integer::compare;
        Operation divideOperation = Integer::divideUnsigned;
        Operation multiplicateOperation = (i, j) -> i * j;

        System.out.println("Result of addOperation.operation method: " + addOperation.operate(1, 2));
        System.out.println("Result of susbtractOperation.operation method: " + susbtractOperation.operate(3, 2));
        System.out.println("Result of divideOperation.operation method: " + divideOperation.operate(12, 3));
        System.out.println("Result of multiplicateOperation.operation method: " + multiplicateOperation.operate(8, 3));

        // Exercise 4
        Filter alphabeticallySortedFilter = list -> list.stream().filter(elem -> elem instanceof String).map(String.class::cast).sorted(Comparator.comparingInt(str -> str.charAt(INDEX_LETTER_TO_FILTER))).toList();
        Filter sortListWithWordsStartingWithLetter = list -> list.stream().filter(elem -> elem instanceof String).map(String.class::cast)
                .sorted(Comparator
                        .comparing((String s) -> !s.toLowerCase().startsWith(LETTER_TO_FILTER))
                        .thenComparing(String::compareToIgnoreCase))
                .toList();
        Filter replacerLetterForNumber = list -> list.stream().filter(elem -> elem instanceof String).map(String.class::cast).map(str -> str.replace(LETTER_TO_BE_REPLACED, NUMBER_TO_REPLACE)).toList();
        Filter numberFilter = list ->  list.stream().filter(elem -> elem instanceof Integer).toString().lines().toList();

        List<Object> elementList = Arrays.asList("hello", 1, "world", 45, "my", "name", "is", 300, "Ines");
        System.out.println(alphabeticallySortedFilter.getFilteredList(elementList));
        System.out.println(sortListWithWordsStartingWithLetter.getFilteredList(elementList));
        System.out.println(replacerLetterForNumber.getFilteredList(elementList));
        System.out.println(numberFilter.getFilteredList(elementList));

    }
}
