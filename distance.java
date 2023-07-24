import java.util.Scanner;

public class distance {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("Menu based app - Unit conversion for Distance ");

        char choice;

        do {

            System.out.println("1. CM to M ");
            System.out.println("2. M to KM ");
            System.out.println("3. KM to M ");
            System.out.println("4. M to CM ");
            System.out.print("Enter Your Choice : ");
            int ch = obj.nextInt();

            if (ch == 1) {

                System.out.print("Enter the CM Value: ");
                int cm = obj.nextInt();
                double m = cm * 0.01;
                System.out.println("The Value in M is = " + m);
            } else if (ch == 2) {

                System.out.print("Enter the M Value: ");
                int m = obj.nextInt();
                double Km = m * 0.001;
                System.out.println("The Value in KM is = " + Km);
            } else if (ch == 3) {

                System.out.print("Enter the KM Value: ");
                int km = obj.nextInt();
                double m = km * 1000;
                System.out.println("The Value in M is = " + m);
            } else if (ch == 4) {

                System.out.print("Enter the M Value: ");
                int m = obj.nextInt();
                double cm = m * 1000;
                System.out.println("The Value in CM is = " + cm);
            } else {
                System.out.println("Wrong Choice Entered !!");

            }
            obj.nextLine();
            System.out.println("Do You Wish To Continue");
            choice = obj.next().charAt(0);
        } while (Character.toUpperCase(choice) == 'Y');
        obj.close();
    }

}
