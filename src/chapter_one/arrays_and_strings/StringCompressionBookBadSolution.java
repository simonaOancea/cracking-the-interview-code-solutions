package chapter_one.arrays_and_strings;

/**
 * Date 17/05/20.
 * @Author Cracking the code interview
 *
 * 1.5 Implement a method to perform basic string compression using the counts of repeated characters.
 * For example, the string aabcccccaaa would become a2b1c5a3. If the "compressed" string would not
 * become smaller than the original string, your method should return the original string.
 */
public class StringCompressionBookBadSolution {

    public static void main(String[] args) {
        String original = "aabcccccaaa";

        System.out.println(compressBad(original));

    }

    public static String compressBad(String str) {
        String mystr = "";
        char last = str.charAt(0);
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == last) {
                count++;
            } else {
                mystr += last + "" + count;
                last = str.charAt(i);
                count = 1;
            }
        }

        return mystr + last + count;
    }




}
