import java.util.ArrayList;
import java.util.List;

public class StringUtilities {

    /**
     * Checks whether a string is a palindrome.
     *
     * @param s input string
     * @return true if the string is a palindrome, otherwise false
     * @throws IllegalArgumentException if the input is null
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
     * Note: trailing whitespace is removed from each element.
     *
     * @param s comma-separated string
     * @return a list containing the split values
     * @throws IllegalArgumentException if the input is null
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
