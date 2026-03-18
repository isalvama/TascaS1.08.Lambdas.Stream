package second_level;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static second_level.SecondLevelMethods.*;

class SecondLevelMethodsTest implements WithAssertions {
    List<String> names;
    List<Integer> numbers;

    @BeforeEach
    public void setUp(){
        names = List.of("Maria", "Pablo", "Alba", "Alex", "Fernando", "Aura");
        numbers = List.of(103, 3, 40, 56, 70, 53);
    }

    @Test
    @DisplayName("An assertion that demonstrates that getNamesStartingWithLetter method returns a List of Strings containing the letter 'a'")
    void getNamesStartingWithLetter_listOfStringsNamesPassedAsParameters_returnsListOfNamesStartingWithLetterA() {
        assertThat(getNamesStartingWithLetter(names)).isEqualTo(List.of("Alba", "Alex", "Aura"));
    }

    @Test
    @DisplayName("An assertion that demonstrates that getStringOfInts method returns a List of Strings containing the letter 'a'")
    void getStringOfInts_listOfIntegersAsParameters_returnsStringOfNumbersJoinedByOOrESeparatedByCommas() {
        assertThat(getStringOfInts(numbers)).isEqualTo("o103, o3, e40, e56, e70, o53");
    }

    @Test
    @DisplayName("An assertion that demonstrates that ADD method returns a sum of two integers")
    void ADD_whenPassingTwoIntegersAsParameters_returnsSumOfParameters() {
        assertThat(OperationMethods.ADD.operate(90, 34)).isEqualTo(124);
    }

    @Test
    @DisplayName("An assertion that demonstrates that DIVIDE method returns quotient")
    void DIVIDE_whenPassingTwoIntegersAsParameters_returnsQuotient() {
        assertThat(OperationMethods.DIVIDE.operate(40, 4)).isEqualTo(10);
    }
}