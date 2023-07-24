import java.util.Scanner;

public class partString {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the String :");
        String word = obj.nextLine();

        int len = word.length();

        System.out.print("Enter the initial index of required string : "); // iinital Sring
        int num1 = obj.nextInt();

        System.out.print("Enter the last index of required string : "); // last string
        int num2 = obj.nextInt();

        if (num1 > len || num2 > len) {
            System.out.println("The Value exceeded the length of the String");
        } else {
            String sub = word.substring(num1, num2 + 1);

            System.out.println("The Required String is : " + sub);
        }

        obj.close();
    }
}
