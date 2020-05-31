package chapter_one.arrays_and_strings;

/**
 * Date 24/05/20.
 * @Author Cracking the interview code
 *
 * 1.7 Write an algorithm such that if an element in an MxN matrix is 0,
 * its entine row and column are set to 0.
 */
public class ConvertRowAndColumnTo0BookSolution {

    public static void main(String[] args) {

        int[][] image = new int[3][3];

        image[0][0] = 0;
        image[0][1] = 2;
        image[0][2] = 3;

        image[1][0] = 4;
        image[1][1] = 5;
        image[1][2] = 6;

        image[2][0] = 7;
        image[2][1] = 0;
        image[2][2] = 9;

        int[][] secondImage = new int[2][3];

        secondImage[0][0] = 3;
        secondImage[0][1] = 6;
        secondImage[0][2] = 0;

        secondImage[1][0] = 1;
        secondImage[1][1] = 2;
        secondImage[1][2] = 7;

        setZeros(image);

        //setZeros(secondImage);

    }

    public static void setZeros(int[][] matrix) {
        boolean[] row = new boolean[matrix.length];
        boolean[] column = new boolean[matrix[0].length];

        //store the row and column index with value 0
        for (int i = 0; i < matrix.length; i++) {
            for (int j= 0; j < matrix[0].length; j++) {

                if (matrix[i][j] == 0) {
                    row[i] = true;
                    column[j] = true;
                }
            }
        }

        //set arr[i][j] to 0 if either row i or column j has a 0
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (row[i] || column[j]) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.println(matrix[i][j]);
            }
        }

    }
}
