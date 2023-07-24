public class newArr {

    public static void main(String[] args) {

        String[] names = { "Dileep", "Ajay", "Satendra", "urvashi" };

        for (int i = 0; i < 4; i++) {

            System.out.print(names[i] + ",");
        }

        for (String i : names) {
            System.out.println(i);
        }
    }
}
