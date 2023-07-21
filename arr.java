public class arr {
    public static void main(String[] args) {
        String[] studentName = { "sam", "Rahul", "Ajay" };

        for (int i = 0; i < studentName.length; i++) {

            System.out.println(studentName[i]);

        }
        System.out.println();
        studentName[1] = "Rahul S";

        for (int i = 0; i < studentName.length; i++) {

            System.out.println(studentName[i]);

        }
        System.out.println();
        int i = 0;
        while (i < studentName.length) {
            System.out.println(studentName[i]);
            i++;
        }

    }
}
