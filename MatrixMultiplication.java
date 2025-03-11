import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the first matrix dimensions
        System.out.print("Enter number of rows for first matrix: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter number of columns for first matrix: ");
        int cols1 = scanner.nextInt();

        // Taking input for the second matrix dimensions
        System.out.print("Enter number of rows for second matrix: ");
        int rows2 = scanner.nextInt();
        System.out.print("Enter number of columns for second matrix: ");
        int cols2 = scanner.nextInt();

        // Checking if multiplication is possible
        if (cols1 != rows2) {
            System.out.println(
                    "Error: Matrix multiplication not possible! Columns of first matrix must be equal to rows of second matrix.");
            return;
        }

        // Creating matrices
        int[][] matrix1 = new int[rows1][cols1];
        int[][] matrix2 = new int[rows2][cols2];
        int[][] resultMatrix = new int[rows1][cols2];

        // Taking input for the first matrix
        System.out.println("Enter elements of the first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                System.out.print("Element at position [" + i + "][" + j + "]: ");
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Taking input for the second matrix
        System.out.println("Enter elements of the second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print("Element at position [" + i + "][" + j + "]: ");
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Performing matrix multiplication
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                resultMatrix[i][j] = 0;
                for (int k = 0; k < cols1; k++) {
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Printing the first matrix
        System.out.println("\nFirst Matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }

        // Printing the second matrix
        System.out.println("\nSecond Matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        // Printing the result matrix
        System.out.println("\nProduct of Matrices:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
