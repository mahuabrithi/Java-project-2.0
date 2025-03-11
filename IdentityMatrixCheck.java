import java.util.Scanner;

public class IdentityMatrixCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for matrix size (square matrix)
        System.out.print("Enter the size of the square matrix: ");
        int size = scanner.nextInt();

        int[][] matrix = new int[size][size];

        // Taking input for the matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Element at position [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Checking if the matrix is an identity matrix
        boolean isIdentity = true;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i == j && matrix[i][j] != 1) || (i != j && matrix[i][j] != 0)) {
                    isIdentity = false;
                    break;
                }
            }
            if (!isIdentity)
                break;
        }

        // Printing the result
        if (isIdentity) {
            System.out.println("\nThe given matrix is an Identity Matrix.");
        } else {
            System.out.println("\nThe given matrix is NOT an Identity Matrix.");
        }

        scanner.close();
    }
}
