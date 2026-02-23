package second_level;

import java.util.Arrays;
import java.util.List;

public class SecondLevelMain {
    public static void main (String[] args){
        List<String> names = Arrays.asList("Laura", "Alba", "Joe", "Albert", "Darien", "Ana", "Aura");

        // Exercise 1
        System.out.println(SecondLevelMethods.getNamesStartingWithA(names));

        // Exercise 2
        System.out.println(SecondLevelMethods.getStringOfInts(Arrays.asList(1, 2, 3, 4, 5)));

        // Exercise 3
        Operation addOperation = Integer::sum;
        Operation susbtractOperation = Integer::compare;
        Operation divideOperation = Integer::divideUnsigned;
        Operation multiplicateOperation = (i, j) -> i * j;

        System.out.println(addOperation.operation(1, 2));
        System.out.println(susbtractOperation.operation(3, 2));
        System.out.println(divideOperation.operation(12, 3));
        System.out.println(multiplicateOperation.operation(8, 3));

        // Exercise 4
        System.out.println(SecondLevelMethods.getSortedList(Arrays.asList("hello", 1, "world", 45, "my", "name", "is", 300, "Ines")));

    }
}
