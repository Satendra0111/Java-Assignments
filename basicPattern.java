public class basicPattern {
    public static void main(String[] args) {

        int rows = 5; // No. of rows needed

        // Printing the top part of the triangle

        for (int i = 1; i <= rows; i++) {

            for (int j = i; j <= rows; j++) {

                System.out.print("*");

            }
            System.out.println();

        }
        // Printing the lower part of the triangle
        for (int i = 1; i < rows; i++) {

            for (int j = 1; j <= i + 1; j++) {

                System.out.print("*");

            }
            System.out.println();

        }
    }
}
