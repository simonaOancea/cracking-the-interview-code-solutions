package chapter_one.arrays_and_strings;


/**
 * Date 15/05/20.
 * @Author Oancea Simona
 *
 * 1.3 Given two strings, write a method to decide if one is a permutation of the other.
 */
public class StringPermutation {
    public static void main(String[] args){
        String one = "abc";
        String two = "Bac  ";
        String three = null;
        String four = "abcdefg";
        String five = "cabdfge";

        System.out.println(isPermutation(one, two));
        System.out.println(isPermutation(one, three));
        System.out.println(isPermutation(four, five));

    }

    public static boolean isPermutation(String one, String two) {
        int nrOfEqualCharacters = 0;

        if (one == null || two == null) {
            return false;
        }

        if (one.length() != two.length()) {
            return false;
        }

        for (int i = 0; i < one.length(); i++) {
            for (int j = 0; j < two.length(); j++) {
                if (one.charAt(i) == two.charAt(j)) {
                    nrOfEqualCharacters++;
                }
            }
        }

        if (nrOfEqualCharacters == one.length()
                && nrOfEqualCharacters == two.length()) {
            return true;
        }

        return false;

    }


}