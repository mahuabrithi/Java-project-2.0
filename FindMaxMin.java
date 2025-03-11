import java.util.Scanner;

public class FindMaxMin {
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

        // Initializing max and min with the first element of the array
        int max = array[0][0];
        int min = array[0][0];

        // Finding max and min values
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (array[i][j] > max) {
                    max = array[i][j]; // Update max if a larger value is found
                }
                if (array[i][j] < min) {
                    min = array[i][j]; // Update min if a smaller value is found
                }
            }
        }

        // Printing the results
        System.out.println("\nThe maximum element in the 2D array is: " + max);
        System.out.println("The minimum element in the 2D array is: " + min);

        scanner.close();
    }
}
