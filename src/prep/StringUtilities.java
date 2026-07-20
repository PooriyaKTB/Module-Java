package src.prep;

import java.util.ArrayList;
import java.util.List;

public class StringUtilities {

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

    public List<String> splitCommaSeparatedLine(String s) {

        if (s == null) throw new IllegalArgumentException();

        List<String> result = new ArrayList<>();
        String[] splitString = s.split(",");

        for (String str : splitString) {
            result.add(str.trim());
        }
        return result;
    }
}
