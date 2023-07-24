public class highestArray {
    public static void main(String[] args) {

        int[] arr = { 31, 42, 25, 100, 56, 61, 13, 45, 76, 55 };
        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Largest number in the array is: " + largest);
    }
}
