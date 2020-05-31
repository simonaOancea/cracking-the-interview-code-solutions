package chapter_one.arrays_and_strings;

/**
 * @Author Simona Oancea
 *
 * 1.1 Write an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures?
 *
 * The time complexity of this code is O(n), whre n is the length of the string.
 * The space complexity is O(1).
 *
 */
public class UniqueCharactersBookSolution {
    public static void main(String[] args) {
        String firstTestString = "aabbccdd";

        System.out.println(isUniqueChars2(firstTestString));
    }

    public static boolean isUniqueChars2(String str) {
        if (str.length() > 256) {
            return false; //assuming character set is ASCII  and we have 256 possible unique characters
        }

        boolean[] char_set = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if(char_set[val]) {
                return false;
            }
            char_set[val] = true;
        }

        return true;
    }
}
