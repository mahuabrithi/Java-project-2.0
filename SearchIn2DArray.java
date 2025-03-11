import java.util.Scanner;

public class SearchIn2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the number of rows and columns
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        // Taking input for the matrix elements
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element at position [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Taking input for the number to search
        System.out.print("\nEnter the number to search: ");
        int target = scanner.nextInt();

        boolean found = false;

        // Searching for the number in the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == target) {
                    System.out.println("Number found at position: Row " + i + ", Column " + j);
                    found = true;
                }
            }
        }

        // If number is not found
        if (!found) {
            System.out.println("Number not found in the matrix.");
        }

        scanner.close();
    }
}
