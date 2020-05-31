package chapter_one.arrays_and_strings;

/**
 * Date 20/05/20.
 *
 * 1.5 Implement a method to perform basic string compression using the counts of repeated characters.
 * For example, the string aabcccccaaa would become a2b1c5a3. If the "compressed" string would not
 * become smaller than the original string, your method should return the original string.
 */
public class StringCompressionAlternateBookSolution {

    public static void main(String[] args){

        String original = "aabcccccaaa";

        System.out.println(compressAlternate(original));

    }

    public static String compressAlternate(String str){
        int size = countCompression(str);

        if(size >= str.length()) {
            return str;
        }

        char[] array = new char[size];
        int index = 0;
        char last = str.charAt(0);
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == last) {
                count++;
            }else {
                index = setChar(array, last, index, count);
                last = str.charAt(i);
                count = 1;

            }
        }

        /*Update string with the last set of repeated characters*/
        index = setChar(array, last, index, count);

        return String.valueOf(array);

    }

    public static int setChar(char[] array, char c, int index, int count) {
        array[index] = c;
        index++;

        /*Convert the count to a string, then to an array of chars*/
        char[] cnt = String.valueOf(count).toCharArray();

        /*Copy characters from biggest digit to smallest*/
        for (char x : cnt) {
            array[index] = x;
            index++;
        }

        return index;
    }


    public static int countCompression(String str){
        if (str == null | str.isEmpty()) {
            return 0;
        }

        char last = str.charAt(0);
        int size = 0;
        int count = 1;

        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i) == last) {
                count++;
            }else {
                last = str.charAt(i);
                size += 1 + String.valueOf(count).length();
                count = 1;
            }
        }

        size += 1 + String.valueOf(count).length();

        return size;
    }
}
