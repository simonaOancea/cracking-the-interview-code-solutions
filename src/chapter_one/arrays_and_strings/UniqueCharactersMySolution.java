package chapter_one.arrays_and_strings;

/**
 * @Author Simona Oancea
 *
 * 1.1 Write an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures?
 *
 */
public class UniqueCharactersMySolution {
    public static void main (String[] args) {
        char[] myStringArray = {'a', 'b', 'f', 'g', 'h', 'i', 'a', 'p', 'i', 'b'};
        char[] mySecondStringArray = {'a', 'b', 'f', 'g', 'a', 'b'};
        char[] myThirdStringArray = {'a'};
        char[] myFourthStringArray = null;
        char[] myFifthStringArray = {'a', 'b', 'c', 'd', 'e', 'f'};

        /*System.out.println(stringHasDuplicates(myStringArray));

        System.out.println(stringHasDuplicates(mySecondStringArray));

        System.out.println(stringHasDuplicates(myThirdStringArray));

        System.out.println(stringHasDuplicates(myFourthStringArray));

        System.out.println(stringHasDuplicates(myFifthStringArray));*/

    }

    public static boolean stringHasDuplicates(char[] array) {
        boolean hasDuplicates = false;

        if (array != null) {
            int n = array.length;
            for (int i = 1; i <= n; i++) {
                for (int j = n - 1; j > i; j--) {

                    if (array[i] == array[j] && i != j) {
                        hasDuplicates = true;
                        break;
                    }
                }
            }

        }

        return hasDuplicates;
    }

}
