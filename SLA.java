import java.util.Scanner;

public class SLA {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.print("Please Enter Number 1: "); // Enter Num 1
        int num1 = obj.nextInt();

        System.out.print("Please Enter Number 2: "); // Enter num 2
        int num2 = obj.nextInt();

        System.out.print("Please Enter Number 3: "); // Enter num 3
        int num3 = obj.nextInt();

        if (num1 > num2 && num1 > num3) {

            System.out.println("The Largest no. is :" + num1);

            if (num2 > num3) {
                System.out.println("The Smallest no. is :" + num3);
            } else {
                System.out.println("The Smallest no. is :" + num2);
            }
        } else if (num2 > num1 && num2 > num3) {

            System.out.println("The Largest no. is :" + num2);

            if (num1 > num3) {
                System.out.println("The Smallest no. is :" + num3);
            } else {
                System.out.println("The Smallest no. is :" + num1);
            }
        } else if (num3 > num2 && num3 > num1) {

            System.out.println("The Largest no. is :" + num3);

            if (num1 > num2) {
                System.out.println("The Smallest no. is :" + num2);
            } else {
                System.out.println("The Smallest no. is :" + num1);
            }
        }

        double avg = (num1 + num2 + num3) / 3;

        System.out.println("Average of All Three Numbers is : " + avg);

        obj.close();

    }
}
