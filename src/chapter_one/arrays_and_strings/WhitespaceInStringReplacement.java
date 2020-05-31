package chapter_one.arrays_and_strings;

/**
 * Date 16/05/20.
 * @Author Simona Oancea
 *
 * 1.4 Write a method to replace all spaces in a string with "%20".
 * You may assume that the string has sufficient space at the end
 * of the string to hold the additional characters, and that you are
 * given the "true" length of the string.
 */

public class WhitespaceInStringReplacement {

    public static void main(String[] args) {
        String s = "Mr John Smith";
        String s2 = "Test  test  ";

        System.out.println(replace(s));
        System.out.println(replace(s2));

    }

    public static String replace(String s) {
        char[] content = s.toCharArray();
        StringBuilder replacement = new StringBuilder();
        StringBuilder pattern = new StringBuilder();
        pattern.append("%20");

        for (int i = 0; i < content.length; i++) {

           if (content[i] == ' ') {
                replacement.append(pattern);
            } else {
               replacement.append(content[i]);
           }
        }

        return replacement.toString();
    }
}
