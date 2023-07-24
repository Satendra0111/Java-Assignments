import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        char choice;
        do {

            System.out.println("Menu based app - Even/Odd Checker");
            System.out.print("Please Enter The Number : ");
            int value = obj.nextInt();
            if (value % 2 == 0) {
                System.out.println(value + " is a Even Number");
            } else {
                System.out.println(value + " is a Odd Number");
            }
            obj.nextLine();
            System.out.println("Do You Wish To Continue");
            choice = obj.next().charAt(0);

        } while (Character.toUpperCase(choice) == 'Y');

        obj.close();

    }
}
