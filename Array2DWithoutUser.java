public class TwoDArrayNoInput {
    public static void main(String[] args) {
        // Declare and initialize a 2x3 2D array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // Display the 2D array
        System.out.println("Matrix is:");
        for (int i = 0; i < matrix.length; i++) {           // rows
            for (int j = 0; j < matrix[i].length; j++) {    // columns
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();  // next row
        }
    }
}
