import java.util.Scanner;

public class RowColumnSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for number of rows and columns
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        // Creating a 2D array
        int[][] array = new int[rows][cols];

        // Taking user input for the array elements
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element at position [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        // Calculating row-wise sum
        System.out.println("\nRow-wise sum:");
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum += array[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + ": " + rowSum);
        }

        // Calculating column-wise sum
        System.out.println("\nColumn-wise sum:");
        for (int j = 0; j < cols; j++) {
            int colSum = 0;
            for (int i = 0; i < rows; i++) {
                colSum += array[i][j];
            }
            System.out.println("Sum of column " + (j + 1) + ": " + colSum);
        }

        scanner.close();
    }
}
