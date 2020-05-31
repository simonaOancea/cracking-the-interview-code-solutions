package chapter_one.arrays_and_strings;

/**
 * Date 24/05/20.
 * @Author Simona Oancea
 *
 * 1.7 Write an algorithm such that if an element in an MxN matrix is 0,
 * its entine row and column are set to 0.
 */
public class ConvertRowAndColumnTo0MySolution {

    public static void main(String[] args){
        int[][] image = new int[3][3];

        image[0][0] = 0;
        image[0][1] = 2;
        image[0][2] = 3;

        image[1][0] = 4;
        image[1][1] = 5;
        image[1][2] = 6;

        image[2][0] = 7;
        image[2][1] = 8;
        image[2][2] = 9;


        int[][] secondImage = new int[2][3];

        secondImage[0][0] = 3;
        secondImage[0][1] = 6;
        secondImage[0][2] = 0;

        secondImage[1][0] = 1;
        secondImage[1][1] = 2;
        secondImage[1][2] = 7;

        //convertMatrix(image);

        convertMatrix(secondImage);
    }


    public static void convertMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int[][] visitedMatrix = new int[n][m];

        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < m; j++) {
                visitedMatrix[i][j] = 1;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (matrix[i][j] == 0
                        && visitedMatrix[i][j] != 0) {

                    int y = 0;
                    int z = 0;

                    while (y < m) {
                        matrix[i][y] = 0;
                        visitedMatrix[i][y] = 0;
                        y++;
                    }

                    while (z < n) {
                        matrix[z][j] = 0;
                        visitedMatrix[z][j] = 0;
                        z++;
                    }

                    visitedMatrix[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println(matrix[i][j]);
            }
        }
    }
}
