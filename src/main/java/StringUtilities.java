import java.util.ArrayList;
import java.util.List;

/**
 * Utility methods for working with strings.
 */
public class StringUtilities {

    /**
     * Checks whether a string is a palindrome.
     * The comparison is case-insensitive.
     *
     * @param s input string
     * @return true if the string is a palindrome, otherwise false
     * @throws IllegalArgumentException if the input is null
     *
     * @see #splitCommaSeparatedLine(String)
     */
    public boolean isPalindrome(String s) {

        if (s == null) throw new IllegalArgumentException();

        s = s.toLowerCase();
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    /**
     * Splits a comma-separated string into a list.
     * This method uses {@link String#split(String)}, therefore
     * trailing empty values are not included in the returned list.
     *
     * @param s comma-separated string
     * @return a list containing the split values
     * @throws IllegalArgumentException if the input is null
     *
     * * @see String#split(String)
     */
    public List<String> splitCommaSeparatedLine(String s) {

        if (s == null) throw new IllegalArgumentException("Input can't be null");

        List<String> result = new ArrayList<>();
        String[] splitString = s.split(",");

        for (String str : splitString) {
            result.add(str.trim());
        }
        return result;
    }
}
