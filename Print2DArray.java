import java.util.Scanner;

public class Print2DArray {
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

        // Printing the 2D array
        System.out.println("\nThe given 2D array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }

        scanner.close();
    }
}
