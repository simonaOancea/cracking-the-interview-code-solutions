package chapter_one.arrays_and_strings;

/**
 * Date 15/05/20.
 * @Author Cracking the code interview
 *
 * Given two strings, write a method to decide if one is a permutation of the other.
 *
 * 1.3 If two strings are anagrams, then we know they have the same characters, but in different
 * orders. Therefore, sorting the strings will put the characters from two anagrams in the
 * same order. We just need to compare the sorted versions of the strings.
 *
 */
public class StringPermutationBookSolution {

    public static void main (String[] args){
        String s = "gdfrt";
        String t = "dgrft";
        System.out.println(permutation(s,t));

    }

    public static String sort(String s) {
        char[] content = s.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }

    public static boolean permutation(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        return sort(s).equals(sort(t));
    }

}
