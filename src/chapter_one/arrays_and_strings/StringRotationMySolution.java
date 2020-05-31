package chapter_one.arrays_and_strings;

/**
 * Date 24/05/20.
 * @Author Simona Oancea
 *
 * 1.8 Assume you have a method isSubstring which checks if one word is a substring of another.
 * Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one call
 * to isSubstring (e.g., "watterbottle" is a rotation of "erbottlewat").
 */

public class StringRotationMySolution {
    public static void main(String[] args) {

        String s1 = "abcd";
        String s2 = "bdac";

        String s3 = "waterbottle";
        String s4 = "erbottlewat";

        System.out.println(isRotation(s1, s2));
        System.out.println(isRotation(s3, s4));

    }

    public static boolean isRotation(String s1, String s2) {

        //make sure inputs are not null
        if(s1 == null || s2 == null) {
            return false;
        }

        //make sure lengths of the strings are the same
        if(s1.length() != s2.length()) {
            return false;
        }

        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();

        boolean[] isContained = new boolean[s1Array.length];
        for(int i = 0; i < isContained.length; i ++) {
            isContained[i] = false;
        }

        //make sure every character in s1 is present in s2 as well
        for(int i = 0; i < s1Array.length; i++) {
            for(int j = 0; j < s2Array.length; j++) {

                if(s1Array[i] == s2Array[j]) {
                    isContained[i] = true;
                }
            }
        }

        for(int i = 0; i < isContained.length; i++) {
            if(!isContained[i]) {
                return false;
            }
        }

        String concatenated = s1 + s1;
        if(concatenated.contains(s2)) {
            return true;
        }

        return false;
    }

}
