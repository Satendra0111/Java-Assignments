import java.util.Arrays;
import java.util.Collections;

public class sorting {
    public static void main(String[] args) {

        int[] arrNum = { 23, 21, 44, 32, 12 };

        Arrays.sort(arrNum);

        System.out.println("Sorted Array in Assending Order:");

        for (int i : arrNum) {

            System.out.print(i + " ");
        }

        System.out.println("\n Sorted Array in Desending Order:");
        for (int i = arrNum.length - 1; i >= 0; i--) {

            System.out.print(arrNum[i] + " ");
        }

    }
}
