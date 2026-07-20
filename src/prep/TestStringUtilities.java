package src.prep;

import org.junit.jupiter.api.*;

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
}
