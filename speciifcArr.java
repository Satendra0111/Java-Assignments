//Write a Java program to fill an array with a specific value.

import java.util.Arrays;

public class speciifcArr {

    public static void main(String[] args) {

        int[] arr1 = new int[6];
        int value = 1;
        Arrays.fill(arr1, value);

        for (int i : arr1) {
            System.out.println(i);
        }

    }

}
