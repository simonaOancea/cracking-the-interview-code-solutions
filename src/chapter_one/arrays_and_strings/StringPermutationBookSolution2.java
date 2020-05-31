package chapter_one.arrays_and_strings;

/**
 * Date 15/05/20.
 * @Author Cracking the code interview
 *
 * Given two strings, write a method to decide if one is a permutation of the other.
 *
 * 1.3 We can also use the definition of an anagram = two words with the same character counts.
 * We simply iterate through this code, counting how many times each character appears.
 * Then, afterwards, we compare the two arrays.
 *
 */
public class StringPermutationBookSolution2 {
    public static void main (String[] args) {
        String s = "abcdefg";
        String t = "bacdefg";

        System.out.println(permutation(s,t));

    }

    public static boolean permutation(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] letters = new int[256]; //assumption;
        char[] s_array = s.toCharArray();
        for (char c : s_array) {
            letters[c]++;
        }

        for (int i = 0; i < t.length(); i++) {
            int c = (int) t.charAt(i);
            if (--letters[c] < 0) {
                return false;
            }
        }

        return true;
    }
}
