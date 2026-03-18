package first_level;


import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static first_level.FirstLevelMethods.*;

class FirstLevelMethodsTest implements WithAssertions {
    List<String> words;
    List<Object> elements;

    @BeforeEach
    public void setUp(){
        words = List.of("books", "lights", "mascara", "photo", "boats", "chair");
        elements = List.of("flowers", 103.3, "lights", 3, "mascaras", 223.56, "photo", 45.2, 70, "chair");
    }
    @Test
    @DisplayName("An assertion that demonstrates that getWordsWithLetter method returns a List of Strings containing the letter 'o'")
    void getWordsWithLetter_listOfStringsPassedAsParameters_returnsListOfStringsWithLetter() {
        assertThat(getWordsWithLetter(words)).isEqualTo(List.of("books", "photo", "boats"));
    }

    @Test
    @DisplayName("An assertion that demonstrates that getWordsWithLetterAndSize method returns the a List of Strings that contain the letter 'o' and have 5 letters")
    void getWordsWithLetterAndSize_listOfStringsPassedAsParameters_returnsListOfStringsWithLetterAndSize() {
        assertThat(getWordsWithLetterAndSize(words)).isEqualTo(List.of("books", "photo", "boats"));
    }

    @Test
    @DisplayName("An assertion that demonstrates that sortElementsByAscendingLength method returns the a List of Strings ordered in ascending length")
    void sortElementsByAscendingLength_listOfStringsIntegersDoublesPassedAsParameters_returnsListOfStringsOrderedAsc() {
        assertThat(sortElementsByAscendingLength(elements)).isEqualTo(List.of("photo", "chair", "lights", "flowers", "mascaras"));
    }

    @Test
    @DisplayName("An assertion that demonstrates that sortElementsByDescendingLength method returns the a List of Strings ordered in ascending length")
    void sortElementsByDescendingLength_listOfStringsIntegersDoublesPassedAsParameters_returnsListOfStringsOrderedDesc() {
        assertThat(sortElementsByDescendingLength(elements)).isEqualTo(List.of("mascaras", "flowers", "lights", "photo", "chair"));
    }
}