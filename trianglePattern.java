public class trianglePattern {
    public static void main(String[] args) {

        int rows = 5; // You can change the number of rows here

        // Printing the top part of the triangle
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j < rows; j++) {
                System.out.print(" "); // Print spaces to center-align the asterisks
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Printing the bottom part of the triangle
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = rows - i; j >= 1; j--) {
                System.out.print(" "); // Print spaces to center-align the asterisks
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
