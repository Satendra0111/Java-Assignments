import java.util.Scanner;

public class outpot {
    public static void main(String[] args) {

        int[] marks = new int[5];
        int[] compare = marks; // duplicate array used for sorting
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int j = 0;
        // int k = 0;
        while (i < marks.length) {

            System.out.print("Enter the Makes of Stident " + (i + 1) + ": ");
            marks[i] = sc.nextInt();

            i++;
        }

        System.out.println();

        for (i = 0; i < marks.length; i++) {

            for (j = i + 1; j < marks.length; j++) {
                int temp = 0;

                if (marks[i] > marks[j]) {
                    temp = marks[i];
                    compare[i] = marks[j];
                    marks[j] = temp;
                    // k = j;

                }
            }

            System.out.println(compare[i]);

        }

        sc.close();

    }
}
