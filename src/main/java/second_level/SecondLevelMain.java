package second_level;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLevelMain {

    public static void main (String[] args){

        // Exercise 1
        List<String> names = Arrays.asList("Laura", "Alba", "Joe", "Albert", "Darien", "Ana", "Aura");
        System.out.println("Result of getNamesStartingWithA method: " + SecondLevelMethods.getNamesStartingWithLetter(names));

        // Exercise 2
        System.out.println("Result of getNamesStartingWithA method: " + SecondLevelMethods.getStringOfInts(Arrays.asList(1, 2, 3, 4, 5, 72, 0, 190)));

        // Exercise 3
        System.out.println("Result of OperationMethods.ADD.operation method: " + OperationMethods.ADD.operate(1, 2));
        System.out.println("Result of OperationMethods.SUBSTRACT.operation method: " + OperationMethods.SUBSTRACT.operate(3, 2));
        System.out.println("Result of OperationMethods.DIVIDE.operation method: " + OperationMethods.DIVIDE.operate(12, 3));
        System.out.println("Result of OperationMethods.MULTIPLY.operation method: " + OperationMethods.MULTIPLY.operate(8, 3));

        // Exercise 4
        List<Object> elementList = Arrays.asList("hello", 1, "world", 45, "my", "name", "is", 300, "Ines");
        System.out.println(FilterMethods.ALPHABETICALLY_SORTED_FILTER.getFilteredList(elementList));
        System.out.println(FilterMethods.SORT_LIST_WITH_WORDS_STARTING_WITH_LETTER.getFilteredList(elementList));
        System.out.println(FilterMethods.REPLACE_LETTER_FOR_NUMBER.getFilteredList(elementList));
        System.out.println(FilterMethods.NUMBER_FILTER.getFilteredList(elementList));

    }
}
