package src.prep;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TestStringUtilities {
    private StringUtilities stringUtilities;

    @BeforeEach
    void initialisation() {
        stringUtilities = new StringUtilities();
    }

    @Test
    @DisplayName("Test for isPalindrome()")
    void testIsPalindrome() {

        Assertions.assertAll(
                () -> assertTrue(stringUtilities.isPalindrome("level")),
                () -> assertTrue(stringUtilities.isPalindrome("Radar")),
                () -> assertTrue(stringUtilities.isPalindrome("wow")),
                () -> assertTrue(stringUtilities.isPalindrome("121")),
                () -> assertTrue(stringUtilities.isPalindrome("P")),
                () -> assertTrue(stringUtilities.isPalindrome(" ")),
                () -> assertTrue(stringUtilities.isPalindrome("")),

                () -> assertFalse(stringUtilities.isPalindrome("lev el")),
                () -> assertFalse(stringUtilities.isPalindrome("java")),
                () -> assertFalse(stringUtilities.isPalindrome("Junit")),
                () -> assertFalse(stringUtilities.isPalindrome("spring")),
                () -> assertFalse(stringUtilities.isPalindrome("1212")),

                () -> assertThrows(IllegalArgumentException.class, () -> stringUtilities.isPalindrome(null))
        );
    }


    @Test
    @DisplayName("Test for splitCommaSeparatedLine()")
    void testSplitCommaSeparatedLine() {

        Assertions.assertAll(
                () -> assertEquals(List.of("java", "spring", "Junit", "121"), stringUtilities.splitCommaSeparatedLine("java ,spring, Junit,121")),
                () -> assertEquals(List.of("java", "spring", "Junit"), stringUtilities.splitCommaSeparatedLine("java,spring,Junit ")),
                () -> assertEquals(List.of("java", "", "Junit"), stringUtilities.splitCommaSeparatedLine("java,,Junit")),
                () -> assertEquals(List.of("java", "Junit"), stringUtilities.splitCommaSeparatedLine("java,Junit")),
                () -> assertEquals(List.of("", "", "java"), stringUtilities.splitCommaSeparatedLine(",,java")),
                () -> assertEquals(List.of("", "java"), stringUtilities.splitCommaSeparatedLine(",java")),
                () -> assertEquals(List.of("java"), stringUtilities.splitCommaSeparatedLine("java,,")),
                () -> assertEquals(List.of("P"), stringUtilities.splitCommaSeparatedLine("P")),
                () -> assertEquals(List.of(""), stringUtilities.splitCommaSeparatedLine(" ")),
                () -> assertEquals(List.of(), stringUtilities.splitCommaSeparatedLine(",")),
                () -> assertEquals(List.of(), stringUtilities.splitCommaSeparatedLine(",,")),
                () -> assertEquals(List.of(""), stringUtilities.splitCommaSeparatedLine("")),
                () -> assertThrows(IllegalArgumentException.class, () -> stringUtilities.splitCommaSeparatedLine(null))
        );
    }


//  *** Stretch Goal - Parameterised tests ***

//  ** @ParameterizedTest with @ValueSource **
    @ParameterizedTest(name = "\"{0}\" is palindrome.")
    @ValueSource(strings = {"level", "Radar", "wow", "121", "P", " ", ""})
    @DisplayName("@ParameterizedTest for isPalindrome() using @ValueSource (expect true)")
    void isPalindromeVS(String string) {
        assertTrue(stringUtilities.isPalindrome(string));
    }

    @ParameterizedTest(name = "\"{0}\" is not palindrome.")
    @ValueSource(strings = {"lev el","java", "Junit", "spring", "1212"})
    @DisplayName("@ParameterizedTest for isPalindrome() using @ValueSource (expect false)")
    void isNotPalindromeVS(String string) {
        assertFalse(stringUtilities.isPalindrome(string));
    }

//  ** @ParameterizedTest with @CsvSource **
    @ParameterizedTest(name = "Test {index}: is \"{0}\" Palindrome? {1}")
    @CsvSource({
            "level,true",
            "Radar,true",
            "wow,true",
            "121,true",
            "P,true",
            "' ',true",
            "'',true",
            "lev el,false",
            "java,false",
            "Junit,false",
            "spring,false",
            "1212,false"
    })
    @DisplayName("@ParameterizedTest for isPalindrome() using @CsvSource")
    void isPalindromeCsv(String input, boolean expected) {
        assertEquals(expected, stringUtilities.isPalindrome(input));
    }

//  ** @ParameterizedTest with @MethodSource **
    @ParameterizedTest(name = "Is \"{0}\" Palindrome? {1}")
    @MethodSource("palindromeWords")
    @DisplayName("@ParameterizedTest for isPalindrome() using @MethodSource")
    void isPalindromeMs(String word, boolean expected) {
        assertEquals(expected, stringUtilities.isPalindrome(word));
    }

    private static List<Arguments> palindromeWords() {
        return List.of(
                Arguments.of("level", true),
                Arguments.of("Radar", true),
                Arguments.of("wow", true),
                Arguments.of("121", true),
                Arguments.of("P", true),
                Arguments.of(" ", true),
                Arguments.of("", true),
                Arguments.of("java", false),
                Arguments.of("Junit", false),
                Arguments.of("spring", false),
                Arguments.of("1212", false)
        );
    }

//  ** Test for isPalindrome() with null input (must come within each of the approaches chosen above) **
    @Test
    @DisplayName("Test for isPalindrome() with null input")
    void testIsPalindromeNullThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> stringUtilities.isPalindrome(null));
    }
}
