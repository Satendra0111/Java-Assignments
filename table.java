import java.util.Scanner;

public class table {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter The Integer whose Multiples are needed: ");
        int num = myObj.nextInt();

        for (int i = 1; i <= 10; i++) {

            System.out.println(num + "x" + i + " = " + num * i);
        }

        myObj.close();
    }
}