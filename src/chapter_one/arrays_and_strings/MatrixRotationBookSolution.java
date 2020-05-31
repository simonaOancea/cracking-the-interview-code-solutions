package chapter_one.arrays_and_strings;

/**
 * Date 22/05/20.
 * @Author Cracking the interview code
 *
 * 1.6 Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes,
 * write a method to rotate the image by 90 degrees. Can you do this in place?
 */
public class MatrixRotationBookSolution {

    public static void main(String[] args){

        int[][] image = new int[3][3];

        image[0][0] = 1;
        image[0][1] = 2;
        image[0][2] = 3;

        image[1][0] = 4;
        image[1][1] = 5;
        image[1][2] = 6;

        image[2][0] = 7;
        image[2][1] = 8;
        image[2][2] = 9;

        rotate(image, 3);

    }

    public static void rotate(int[][] matrix, int n) {
        for (int layer = 0; layer < n/2; ++layer) {
            int first = layer;
            int last = n - 1 - layer;

            for (int i = first; i < last; ++i) {
                int offset = i - first;

                //save top
                int top = matrix[first][i];

                //left -> top
                matrix[first][i] = matrix[last - offset][first];

                //bottom -> left
                matrix[last - offset][first] = matrix[last][last - offset];

                //right -> bottom
                matrix[last][last - offset] = matrix[i][last];

                //top -> right
                matrix[i][last] = top;
            }
        }

        for (int k = 0; k < n; k++) {
            for (int z = 0; z < n; z++) {
                System.out.println(matrix[k][z]);
            }
        }

    }
}
