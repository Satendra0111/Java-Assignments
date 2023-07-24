import java.lang.reflect.Array;
import java.util.Arrays;

public class searchArray {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int search = 9;
        boolean flag = false;
        // program to check if an array contains a specific element.
        for (int i : arr) {

            if (i == search) {
                System.out.println("Data is present in the Array");
                flag = true;
                break;
            }
        }
        if (flag == false) {
            System.out.println("Data is not present in the Array");
        }

        Arrays.sort(arr);
        int index = Arrays.binarySearch(arr, search);
        System.out.println(index); // If the value is not present it will give the -ve along with the possible
                                   // index the searched value can be inserted

    }
}
