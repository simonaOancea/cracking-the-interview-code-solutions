package chapter_one.arrays_and_strings;

/**
 * Date 26/05/20.
 *
 * 1.8 Assume you have a method isSubstring which checks if one word is a substring of another.
 * Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one call
 * to isSubstring (e.g., "watterbottle" is a rotation of "erbottlewat").
 */
public class StringRotationBestSolution {

    public static void main(String[] args) {

        String input1 = "waterbottle";
        String rotated1 = "erbottlewat";

        String input2 = "abcd";
        String rotated2 = "cabd";

        System.out.println(isRotated(input1, rotated1));
        //System.out.println(isRotated(input2, rotated2));

    }

    public static boolean isRotated(String input, String rotated) {

        if (input == null || rotated == null) {
            return false;

        } else if (input.length() != rotated.length()) {
            return false;
        }

        int index = rotated.indexOf(input.charAt(0));
        if (index > -1) {

            if (input.equalsIgnoreCase(rotated)) {
                return true;
            }

            int finalPos = rotated.length() -index;

            return rotated.charAt(0) == input.charAt(finalPos)
                    && input.substring(finalPos).equals(rotated.substring(0, index));
        }

        return false;
    }
}
