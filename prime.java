import java.util.Scanner;

public class prime {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int flag = 0;
        System.out.print("Please Enter the number greter than 2 :");
        int num = obj.nextInt();

        if (num == 0 || num == 1) {
            System.out.println("Not a prime number");
        } else {

            for (int i = 2; i < num / 2; i++) {
                if (num % i == 0) {
                    System.out.println("Not a prime number");
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 0) {
            System.out.println("Prime number");
        }
        obj.close();
    }
}
