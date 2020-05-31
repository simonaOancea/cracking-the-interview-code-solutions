package chapter_one.arrays_and_strings;

/**
 * Date 17/05/20.
 * @Author Cracking the code interview
 *
 * 1.4 Write a method to replace all spaces in a string with "%20".
 * You may assume that the string has sufficient space at the end
 * of the string to hold the additional characters, and that you are
 * given the "true" length of the string.
 */

public class WhiteSpaceStringReplacementBookSolution {
    public static void main(String[] args) {
        char[] str = {'M', 'r', ' ', 'J', 'o', 'h', 'n', ' ', 'S', 'm', 'i', 't', 'h'};
        int length = 13;

        replaceSpaces(str);
    }

    public static void replaceSpaces(char[] str){
        int length = str.length;
        int spaceCount = 0, newLength, i;
        for (i = 0; i < length; i++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }

        newLength = length + spaceCount * 2;
       // str[newLength] = '\0';

        for (i = length - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[newLength - 1] = '0';
                str[newLength - 2] = '2';
                str[newLength - 3] = '%';
                newLength = newLength - 3;
            } else {
                str[newLength - 1] = str[i];
            }
        }
    }


}
