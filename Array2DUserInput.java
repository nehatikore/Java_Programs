import java.util.Scanner;

public class TwoDArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declare a 2D array with 2 rows and 3 columns
        int[][] matrix = new int[2][3];

        // Input elements from user
        System.out.println("Enter 2x3 matrix elements:");
        for (int i = 0; i < 2; i++) {            // Rows
            for (int j = 0; j < 3; j++) {        // Columns
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // Display the 2D array
        System.out.println("\nMatrix is:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // move to next row
        }

        sc.close();
    }
}
