public class shiftOneToEnd {
    public static void main(String[] args) {
        int[] arrNum = { 3, 1, 4, 1, 2, 1, 8, 3, 2, 1 };
        int ln = arrNum.length;
        int[] newarr = new int[ln];
        int index = 0;

        System.out.println("Current Array: ");
        for (int i : arrNum) {
            System.out.print(i + " ");
        }

        for (int i = 0; i < ln; i++) {
            if (arrNum[i] != 1) {

                newarr[index] = arrNum[i];
                index++;
            }
        }

        for (int i = index; i < ln; i++) {

            newarr[i] = 1;
        }

        System.out.println("\n Required Array: ");
        for (int i : newarr) {
            System.out.print(i + " ");
        }

    }
}
