import java.util.Scanner;

public class gpa {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter Marks Obtained By The Student : ");
        double obtained = myObj.nextDouble();
        System.out.print("Enter Total Marks: ");
        double total = myObj.nextDouble();

        double per = (obtained / total) * 100;

        if (per > 0 && per <= 59) {

            System.out.println("Percentage obtained :" + per + "%");
            System.out.println("Grade F , GPA = 0.0");

        }
        if (per >= 60 && per <= 69) {

            System.out.println("Percentage obtained :" + per + "%");
            System.out.println("Grade D , GPA = 1.0");
        }
        if (per >= 70 && per <= 79) {

            System.out.println("Percentage obtained :" + per + "%");
            System.out.println("Grade C , GPA = 2.0");
        }
        if (per >= 80 && per <= 89) {

            System.out.println("Percentage obtained :" + per + "%");
            System.out.println("Grade B , GPA = 3.0");
        }
        if (per >= 90) {

            System.out.println("Percentage obtained :" + per + "%");
            System.out.println("Grade A , GPA = 4.0");
        }

        myObj.close();

    }
}
