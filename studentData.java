import java.util.Scanner;

public class studentData {

    public static void main(String[] args) {

        int[] studentID = new int[50];
        String[] studentName = new String[50];
        int[] studentMarks = new int[50];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {

            // Student ID
            System.out.print("Enter the Student ID : ");
            studentID[i] = sc.nextInt();

            // Student Name
            sc.nextLine();
            System.out.print("Enter the Student Name : ");
            studentName[i] = sc.nextLine();

            // Student Name
            System.out.print("Enter the Total Marks Earned : ");
            studentMarks[i] = sc.nextInt();

            System.out.println();

        }

        System.out.println("ID " + " Name " + " Marks ");

        for (int i = 0; i < 3; i++) {

            System.out.println(studentID[i] + "   " + studentName[i] + "   " + studentMarks[i]);

        }

        sc.close();

    }

}
