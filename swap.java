import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the numner A :");
        int A = obj.nextInt();
        System.out.print("Enter the numner B :");
        int B = obj.nextInt();

        System.out.println("Value of A =" + A + " and Value Of B =" + B);

        int c = A;
        A = B;
        B = c;
        System.out.println("Value After Swaping");
        System.out.println("A = " + A + " and B = " + B);

    }
}
