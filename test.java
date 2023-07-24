public class test {
    public static void main(String[] args) {
        int[] arrayNum = new int[10];

        for (int i = 0; i < 10; i++) {

            arrayNum[i] = i;

            i++;

        }

        for (int i = 0; i < 10; i++) {

            System.out.println(arrayNum[i] + " ");

        }
    }
}
