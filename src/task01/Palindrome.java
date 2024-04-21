package task01;

public class Palindrome {
    public boolean isPalindrome(String s) {

        if (s.isEmpty()) {
            return true;
        }

        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            char first = s.charAt(start);
            char last = s.charAt(end);

            if (!Character.isLetterOrDigit(first)) {
                start += 1;
            } else if (!Character.isLetterOrDigit(last)) {
                end -= 1;
            } else {
                if (Character.toLowerCase(first) != Character.toLowerCase(last)) {
                    return false;
                }

                start += 1;
                end -= 1;
            }
        }
        return true;
    }
}
